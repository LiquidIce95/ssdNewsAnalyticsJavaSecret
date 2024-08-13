package ssd.AbstractClasses.Analytics.RESTapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ssd.AbstractClasses.Analytics.Analytics;
import ssd.AbstractClasses.Analytics.AnalyticsRepository;
import ssd.AbstractClasses.Analytics.RESTapi.DTO.AnalyticsGetDTO;

import java.util.List;
import java.util.stream.Collectors;

public abstract class AnalyticsController<
        T extends Analytics,
        R extends AnalyticsRepository<T>,
        D extends AnalyticsGetDTO,
        F extends AnalyticsMapper<T,D>> {

    @Autowired
    protected R repository;

    @Autowired
    protected F mapper;

    @Autowired
    public AnalyticsController(R repository, F mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @GetMapping("/")
    public ResponseEntity<List<AnalyticsGetDTO>> getAllAnalytics() {
        List<T> analytics = repository.findAll();
        List<AnalyticsGetDTO> dtoList = analytics.stream()
                .map(mapper::convertEntityToGetDTO)
                .collect(Collectors.toList());
        return new ResponseEntity<>(dtoList, HttpStatus.OK);
    }

    @GetMapping("/{analyticsId}")
    public ResponseEntity<D> getAnalyticsById(@PathVariable Long analyticsId) {
        return repository.findById(analyticsId)
                .map(analytics -> new ResponseEntity<>(mapper.convertEntityToGetDTO(analytics), HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
