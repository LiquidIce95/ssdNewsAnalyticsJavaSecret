package ssd.AbstractClasses.Raw.RESTapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ssd.AbstractClasses.Raw.EntityRaw;
import ssd.AbstractClasses.Raw.EntityRawRepository;
import ssd.AbstractClasses.Raw.RESTapi.DTO.EntityRawGetDTO;
import ssd.AbstractClasses.Base.BaseEntity;
import ssd.AbstractClasses.Analytics.Analytics;

import java.util.List;
import java.util.stream.Collectors;

public abstract class EntityRawController<
        T extends EntityRaw<? extends BaseEntity<? extends Analytics>>,
        R extends EntityRawRepository<T>,
        D extends EntityRawGetDTO<? extends BaseEntity<? extends Analytics>>,
        F extends EntityRawMapper<T, D>> {

    @Autowired
    protected R repository;

    @Autowired
    protected F mapper;

    @Autowired
    public EntityRawController(R repository, F mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @GetMapping("/")
    public ResponseEntity<List<D>> getAllRawEntities() {
        List<T> entities = repository.findAll();
        List<D> dtoList = entities.stream()
                .map(mapper::convertEntityToGetDTO)
                .collect(Collectors.toList());
        return new ResponseEntity<>(dtoList, HttpStatus.OK);
    }

    @GetMapping("/{rawEntityId}")
    public ResponseEntity<D> getRawEntityById(@PathVariable Long rawEntityId) {
        return repository.findById(rawEntityId)
                .map(entity -> new ResponseEntity<>(mapper.convertEntityToGetDTO(entity), HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/url/{url}")
    public ResponseEntity<D> getRawEntityByUrl(@PathVariable String url) {
        return repository.findByUrl(url)
                .map(entity -> new ResponseEntity<>(mapper.convertEntityToGetDTO(entity), HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
