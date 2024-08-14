package ssd.AbstractClasses.Raw.RESTapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import ssd.AbstractClasses.AbstractMapper;
import ssd.AbstractClasses.Analytics.Analytics;
import ssd.AbstractClasses.Analytics.RESTapi.AnalyticsDTO;
import ssd.AbstractClasses.Base.BaseEntity;
import ssd.AbstractClasses.Base.RESTapi.BaseEntityDTO;
import ssd.AbstractClasses.Raw.EntityRaw;
import ssd.AbstractClasses.Raw.EntityRawRepository;

import java.util.List;
import java.util.stream.Collectors;

public abstract class EntityRawController<
        A extends Analytics,
        AD extends AnalyticsDTO,
        B extends BaseEntity<A>,
        BD extends BaseEntityDTO<AD>,
        R extends EntityRaw<B>,
        RD extends EntityRawDTO<BD>,
        Re extends EntityRawRepository<R>,
        M extends AbstractMapper<A,AD,B,BD,R,RD>> {

        @Autowired
        protected Re repository;
    
        @Autowired
        protected M mapper;

        @Autowired
        public EntityRawController(Re repository, M mapper) {
          this.repository = repository;
          this.mapper = mapper;
        }
    
        @PostMapping("/")
        public ResponseEntity<RD> createRawEntity(@RequestBody RD postDTO) {
            R entity = mapper.createEntityRawFromDTO(postDTO);
            R savedEntity = repository.saveAndFlush(entity);
            RD getDTO = mapper.convertEntityRawToDTO(savedEntity);
            return new ResponseEntity<>(getDTO, HttpStatus.CREATED);
        }
    
        @PutMapping("/{id}")
        public ResponseEntity<RD> updateRawEntity(@PathVariable Long id, @RequestBody RD putDTO) {
            return repository.findById(id).map(existingEntity -> {
                R updatedEntity = mapper.updateEntityRawFromDTO(putDTO, existingEntity);
                repository.saveAndFlush(updatedEntity);
                RD getDTO = mapper.convertEntityRawToDTO(updatedEntity);
                return new ResponseEntity<>(getDTO, HttpStatus.OK);
            }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }
    
        @GetMapping("/{id}")
        public ResponseEntity<RD> getRawEntityById(@PathVariable Long id) {
            return repository.findById(id)
                    .map(entity -> new ResponseEntity<>(mapper.convertEntityRawToDTO(entity), HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }
    
        @GetMapping("/")
        public ResponseEntity<List<RD>> getAllRawEntities() {
            List<R> entities = repository.findAll();
            List<RD> getDTOs = entities.stream()
                    .map(mapper::convertEntityRawToDTO)
                    .collect(Collectors.toList());
            return new ResponseEntity<>(getDTOs, HttpStatus.OK);
        }
}
