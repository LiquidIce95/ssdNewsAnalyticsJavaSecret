package ssd.AbstractClasses.Raw.RESTapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ssd.AbstractClasses.Analytics.Analytics;
import ssd.AbstractClasses.Analytics.RESTapi.DTO.AnalyticsGetDTO;
import ssd.AbstractClasses.Analytics.RESTapi.DTO.AnalyticsPostDTO;
import ssd.AbstractClasses.Analytics.RESTapi.DTO.AnalyticsPutDTO;
import ssd.AbstractClasses.Base.BaseEntity;
import ssd.AbstractClasses.Base.RESTapi.DTO.BaseEntityGetDTO;
import ssd.AbstractClasses.Base.RESTapi.DTO.BaseEntityPostDTO;
import ssd.AbstractClasses.Base.RESTapi.DTO.BaseEntityPutDTO;
import ssd.AbstractClasses.Raw.EntityRaw;
import ssd.AbstractClasses.Raw.EntityRawRepository;
import ssd.AbstractClasses.Raw.RESTapi.DTO.EntityRawGetDTO;
import ssd.AbstractClasses.Raw.RESTapi.DTO.EntityRawPostDTO;
import ssd.AbstractClasses.Raw.RESTapi.DTO.EntityRawPutDTO;

import java.util.List;
import java.util.stream.Collectors;

public abstract class EntityRawController<
        E extends EntityRaw<? extends BaseEntity<? extends Analytics>>,
        R extends EntityRawRepository<E>,
        G extends EntityRawGetDTO<? extends BaseEntityGetDTO<? extends AnalyticsGetDTO>>,
        P extends EntityRawPostDTO<? extends BaseEntityPostDTO<? extends AnalyticsPostDTO>>,
        U extends EntityRawPutDTO<? extends BaseEntityPutDTO<? extends AnalyticsPutDTO>>,
        M extends EntityRawMapper<E, G, P, U>> {

        @Autowired
        protected R repository;
    
        @Autowired
        protected M mapper;

        @Autowired
        public EntityRawController(R repository, M mapper) {
          this.repository = repository;
          this.mapper = mapper;
        }
    
        @PostMapping("/")
        public ResponseEntity<G> createRawEntity(@RequestBody P postDTO) {
            E entity = mapper.convertPostDTOToEntity(postDTO);
            E savedEntity = repository.saveAndFlush(entity);
            G getDTO = mapper.convertEntityToGetDTO(savedEntity);
            return new ResponseEntity<>(getDTO, HttpStatus.CREATED);
        }
    
        @PutMapping("/{id}")
        public ResponseEntity<G> updateRawEntity(@PathVariable Long id, @RequestBody U putDTO) {
            return repository.findById(id).map(existingEntity -> {
                E updatedEntity = mapper.updateEntityFromPutDTO(putDTO, existingEntity);
                repository.saveAndFlush(updatedEntity);
                G getDTO = mapper.convertEntityToGetDTO(updatedEntity);
                return new ResponseEntity<>(getDTO, HttpStatus.OK);
            }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }
    
        @GetMapping("/{id}")
        public ResponseEntity<G> getRawEntityById(@PathVariable Long id) {
            return repository.findById(id)
                    .map(entity -> new ResponseEntity<>(mapper.convertEntityToGetDTO(entity), HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }
    
        @GetMapping("/")
        public ResponseEntity<List<G>> getAllRawEntities() {
            List<E> entities = repository.findAll();
            List<G> getDTOs = entities.stream()
                    .map(mapper::convertEntityToGetDTO)
                    .collect(Collectors.toList());
            return new ResponseEntity<>(getDTOs, HttpStatus.OK);
        }
}
