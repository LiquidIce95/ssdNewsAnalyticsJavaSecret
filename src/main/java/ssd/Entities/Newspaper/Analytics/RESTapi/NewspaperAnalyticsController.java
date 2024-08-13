package ssd.Entities.Newspaper.Analytics.RESTapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ssd.Entities.Newspaper.Analytics.NewspaperAnalytics;
import ssd.Entities.Newspaper.Analytics.NewspaperAnalyticsRepository;
import ssd.Entities.Newspaper.Analytics.RESTapi.DTO.NewspaperAnalyticsGetDTO;
import ssd.Entities.Newspaper.Analytics.RESTapi.DTO.NewspaperAnalyticsPostDTO;
import ssd.Entities.Newspaper.Analytics.RESTapi.DTO.NewspaperAnalyticsPutDTO;
import ssd.AbstractClasses.Analytics.RESTapi.AnalyticsController;

@RestController
@RequestMapping("/newspaper-analytics")
public class NewspaperAnalyticsController extends AnalyticsController<NewspaperAnalytics, NewspaperAnalyticsRepository, NewspaperAnalyticsGetDTO, NewspaperAnalyticsPostDTO, NewspaperAnalyticsPutDTO, NewspaperAnalyticsMapper> {

    public NewspaperAnalyticsController(NewspaperAnalyticsRepository repository, NewspaperAnalyticsMapper mapper) {
        super(repository, mapper);
    }
}
