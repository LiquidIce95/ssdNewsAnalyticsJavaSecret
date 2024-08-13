package ssd.Entities.Publisher.Analytics.RESTapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ssd.AbstractClasses.Analytics.RESTapi.AnalyticsController;
import ssd.Entities.Publisher.Analytics.PublisherAnalytics;
import ssd.Entities.Publisher.Analytics.PublisherAnalyticsRepository;
import ssd.Entities.Publisher.Analytics.RESTapi.DTO.PublisherAnalyticsGetDTO;

@RestController
@RequestMapping("/publisher-analytics")
public class PublisherAnalyticsController extends AnalyticsController<PublisherAnalytics, PublisherAnalyticsRepository, PublisherAnalyticsGetDTO,PublisherAnalyticsMapper> {

    public PublisherAnalyticsController(PublisherAnalyticsRepository repository, PublisherAnalyticsMapper mapper) {
        super(repository, mapper);
    }
}
