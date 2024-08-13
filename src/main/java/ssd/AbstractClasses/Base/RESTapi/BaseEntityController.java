package ssd.AbstractClasses.Base.RESTapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ssd.AbstractClasses.Analytics.Analytics;
import ssd.AbstractClasses.Analytics.RESTapi.DTO.AnalyticsGetDTO;
import ssd.AbstractClasses.Analytics.RESTapi.DTO.AnalyticsPostDTO;
import ssd.AbstractClasses.Analytics.RESTapi.DTO.AnalyticsPutDTO;
import ssd.AbstractClasses.Base.BaseEntity;
import ssd.AbstractClasses.Base.BaseEntityRepository;
import ssd.AbstractClasses.Base.RESTapi.DTO.BaseEntityGetDTO;
import ssd.AbstractClasses.Base.RESTapi.DTO.BaseEntityPostDTO;
import ssd.AbstractClasses.Base.RESTapi.DTO.BaseEntityPutDTO;

import java.util.List;
import java.util.stream.Collectors;

public abstract class BaseEntityController<
        E extends BaseEntity<? extends Analytics>,
        R extends BaseEntityRepository<E>,
        G extends BaseEntityGetDTO<? extends AnalyticsGetDTO>,
        P extends BaseEntityPostDTO<? extends AnalyticsPostDTO>,
        U extends BaseEntityPutDTO<? extends AnalyticsPutDTO>,
        M extends BaseEntityMapper<E, G, P, U>> {

    @Autowired
    protected R repository;

    @Autowired
    protected M mapper;

    @Autowired
    public BaseEntityController(R repository, M mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @PostMapping("/")
    public ResponseEntity<G> createEntity(@RequestBody P postDTO) {
        E entity = mapper.convertPostDTOToEntity(postDTO);
        E savedEntity = repository.saveAndFlush(entity);
        G getDTO = mapper.convertEntityToGetDTO(savedEntity);
        return new ResponseEntity<>(getDTO, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<G> updateEntity(@PathVariable Long id, @RequestBody U putDTO) {
        return repository.findById(id).map(existingEntity -> {
            E updatedEntity = mapper.updateEntityFromPutDTO(putDTO, existingEntity);
            repository.saveAndFlush(updatedEntity);
            G getDTO = mapper.convertEntityToGetDTO(updatedEntity);
            return new ResponseEntity<>(getDTO, HttpStatus.OK);
        }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/{id}")
    public ResponseEntity<G> getEntityById(@PathVariable Long id) {
        return repository.findById(id)
                .map(entity -> new ResponseEntity<>(mapper.convertEntityToGetDTO(entity), HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/")
    public ResponseEntity<List<G>> getAllEntities() {
        List<E> entities = repository.findAll();
        List<G> getDTOs = entities.stream()
                .map(mapper::convertEntityToGetDTO)
                .collect(Collectors.toList());
        return new ResponseEntity<>(getDTOs, HttpStatus.OK);
    }
    @GetMapping("/name/{name}")
    public ResponseEntity<List<G>> getEntitiesByName(@PathVariable String name) {
        List<E> entities = repository.findByName(name);
        if (entities.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            List<G> dtoList = entities.stream()
                    .map(mapper::convertEntityToGetDTO)
                    .collect(Collectors.toList());
            return new ResponseEntity<>(dtoList, HttpStatus.OK);
        }
    }

    @GetMapping("/popular/{amount}")
    public ResponseEntity<List<G>> getPopularEntities(@PathVariable int amount) {
        List<E> entities = repository.findAll();
        if (entities.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            int size = entities.size();
            List<E> popularEntities = entities.subList(Math.max(size - amount, 0), size);
            List<G> dtoList = popularEntities.stream()
                    .map(mapper::convertEntityToGetDTO)
                    .collect(Collectors.toList());
            return new ResponseEntity<>(dtoList, HttpStatus.OK);
        }
    }
}
