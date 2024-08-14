package ssd.AbstractClasses.Base.RESTapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import ssd.AbstractClasses.AbstractMapper;
import ssd.AbstractClasses.Analytics.Analytics;
import ssd.AbstractClasses.Analytics.RESTapi.AnalyticsDTO;
import ssd.AbstractClasses.Base.BaseEntity;
import ssd.AbstractClasses.Base.BaseEntityRepository;
import ssd.AbstractClasses.Raw.EntityRaw;
import ssd.AbstractClasses.Raw.RESTapi.EntityRawDTO;

import java.util.List;
import java.util.stream.Collectors;

public abstract class BaseEntityController<
        A extends Analytics,
        AD extends AnalyticsDTO,
        B extends BaseEntity<A>,
        BD extends BaseEntityDTO<AD>,
        R extends EntityRaw<B>,
        RD extends EntityRawDTO<BD>,
        Re extends BaseEntityRepository<B>,
        M extends AbstractMapper<A, AD, B, BD, R, RD>> {

    @Autowired
    protected Re repository;

    @Autowired
    protected M mapper;

    @Autowired
    public BaseEntityController(Re repository, M mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @PutMapping("/{id}")
    public ResponseEntity<BD> updateEntity(@PathVariable Long id, @RequestBody BD putDTO) {
        return repository.findById(id).map(existingEntity -> {
            B updatedEntity = mapper.updateBaseEntityFromDTO(putDTO, existingEntity);
            repository.saveAndFlush(updatedEntity);
            BD getDTO = mapper.convertBaseEntityToDTO(updatedEntity);
            return new ResponseEntity<>(getDTO, HttpStatus.OK);
        }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/{id}")
    public ResponseEntity<BD> getEntityById(@PathVariable Long id) {
        return repository.findById(id)
                .map(entity -> new ResponseEntity<>(mapper.convertBaseEntityToDTO(entity), HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/")
    public ResponseEntity<List<BD>> getAllEntities() {
        List<B> entities = repository.findAll();
        List<BD> getDTOs = entities.stream()
                .map(mapper::convertBaseEntityToDTO)
                .collect(Collectors.toList());
        return new ResponseEntity<>(getDTOs, HttpStatus.OK);
    }
    @GetMapping("/name/{name}")
    public ResponseEntity<List<BD>> getEntitiesByName(@PathVariable String name) {
        List<B> entities = repository.findByName(name);
        if (entities.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            List<BD> dtoList = entities.stream()
                    .map(mapper::convertBaseEntityToDTO)
                    .collect(Collectors.toList());
            return new ResponseEntity<>(dtoList, HttpStatus.OK);
        }
    }

    @GetMapping("/popular/{amount}")
    public ResponseEntity<List<BD>> getPopularEntities(@PathVariable int amount) {
        List<B> entities = repository.findAll();
        if (entities.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            int size = entities.size();
            List<B> popularEntities = entities.subList(Math.max(size - amount, 0), size);
            List<BD> dtoList = popularEntities.stream()
                    .map(mapper::convertBaseEntityToDTO)
                    .collect(Collectors.toList());
            return new ResponseEntity<>(dtoList, HttpStatus.OK);
        }
    }
}
