package ssd.AbstractClasses.Analytics.RESTapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ssd.AbstractClasses.Analytics.Analytics;
import ssd.AbstractClasses.Analytics.AnalyticsRepository;
import ssd.AbstractClasses.Analytics.RESTapi.DTO.AnalyticsGetDTO;
import ssd.AbstractClasses.Analytics.RESTapi.DTO.AnalyticsPostDTO;
import ssd.AbstractClasses.Analytics.RESTapi.DTO.AnalyticsPutDTO;

import java.util.List;
import java.util.stream.Collectors;

public abstract class AnalyticsController<
        E extends Analytics,
        R extends AnalyticsRepository<E>,
        G extends AnalyticsGetDTO,
        P extends AnalyticsPostDTO,
        U extends AnalyticsPutDTO,
        M extends AnalyticsMapper<E, G, P, U>> {

    @Autowired
    protected R repository;

    @Autowired
    protected M mapper;

    @Autowired
    public AnalyticsController(R repository, M mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }


    @PostMapping("/")
    public ResponseEntity<G> createAnalytics(@RequestBody P postDTO) {
        E entity = mapper.convertPostDTOToEntity(postDTO);
        E savedEntity = repository.saveAndFlush(entity);
        G getDTO = mapper.convertEntityToGetDTO(savedEntity);
        return new ResponseEntity<>(getDTO, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<G> updateAnalytics(@PathVariable Long id, @RequestBody U putDTO) {
        return repository.findById(id).map(existingEntity -> {
            E updatedEntity = mapper.updateEntityFromPutDTO(putDTO, existingEntity);
            repository.saveAndFlush(updatedEntity);
            G getDTO = mapper.convertEntityToGetDTO(updatedEntity);
            return new ResponseEntity<>(getDTO, HttpStatus.OK);
        }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/{id}")
    public ResponseEntity<G> getAnalyticsById(@PathVariable Long id) {
        return repository.findById(id)
                .map(entity -> new ResponseEntity<>(mapper.convertEntityToGetDTO(entity), HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/")
    public ResponseEntity<List<G>> getAllAnalytics() {
        List<E> entities = repository.findAll();
        List<G> getDTOs = entities.stream()
                .map(mapper::convertEntityToGetDTO)
                .collect(Collectors.toList());
        return new ResponseEntity<>(getDTOs, HttpStatus.OK);
    }
}
