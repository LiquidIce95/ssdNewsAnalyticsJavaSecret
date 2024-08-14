package ssd.AbstractClasses.Analytics.RESTapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import ssd.AbstractClasses.AbstractMapper;
import ssd.AbstractClasses.Analytics.Analytics;
import ssd.AbstractClasses.Analytics.AnalyticsRepository;
import ssd.AbstractClasses.Base.BaseEntity;
import ssd.AbstractClasses.Base.RESTapi.BaseEntityDTO;
import ssd.AbstractClasses.Raw.EntityRaw;
import ssd.AbstractClasses.Raw.RESTapi.EntityRawDTO;

import java.util.List;
import java.util.stream.Collectors;

public abstract class AnalyticsController<
        A extends Analytics,
        AD extends AnalyticsDTO,
        B extends BaseEntity<A>,
        BD extends BaseEntityDTO<AD>,
        R extends EntityRaw<B>,
        RD extends EntityRawDTO<BD>,
        Re extends AnalyticsRepository<A>,
        M extends AbstractMapper<A,AD,B,BD,R,RD>> {

    @Autowired
    protected Re repository;

    @Autowired
    protected M mapper;

    @Autowired
    public AnalyticsController(Re repository, M mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }


    @PutMapping("/{id}")
    public ResponseEntity<AD> updateAnalytics(@PathVariable Long id, @RequestBody AD putDTO) {
        return repository.findById(id).map(existingEntity -> {
            A updatedEntity = mapper.updateAnalyticsFromDTO(putDTO, existingEntity);
            repository.saveAndFlush(updatedEntity);
            AD getDTO = mapper.convertAnalyticsToDTO(updatedEntity);
            return new ResponseEntity<>(getDTO, HttpStatus.OK);
        }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/{id}")
    public ResponseEntity<AD> getAnalyticsById(@PathVariable Long id) {
        return repository.findById(id)
                .map(entity -> new ResponseEntity<>(mapper.convertAnalyticsToDTO(entity), HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/")
    public ResponseEntity<List<AD>> getAllAnalytics() {
        List<A> entities = repository.findAll();
        List<AD> getDTOs = entities.stream()
                .map(mapper::convertAnalyticsToDTO)
                .collect(Collectors.toList());
        return new ResponseEntity<>(getDTOs, HttpStatus.OK);
    }
}
