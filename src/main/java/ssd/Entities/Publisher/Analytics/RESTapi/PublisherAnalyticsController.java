package ssd.Entities.Publisher.Analytics.RESTapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ssd.Entities.Publisher.Analytics.PublisherAnalytics;
import ssd.Entities.Publisher.Analytics.PublisherAnalyticsRepository;
import ssd.Entities.Publisher.Analytics.RESTapi.DTO.PublisherAnalyticsGetDTO;
import ssd.Entities.Publisher.Analytics.RESTapi.DTO.PublisherAnalyticsPostDTO;
import ssd.Entities.Publisher.Analytics.RESTapi.DTO.PublisherAnalyticsPutDTO;
import ssd.AbstractClasses.Analytics.RESTapi.AnalyticsController;

@RestController
@RequestMapping("/publisher-analytics")
public class PublisherAnalyticsController extends AnalyticsController<PublisherAnalytics, PublisherAnalyticsRepository, PublisherAnalyticsGetDTO, PublisherAnalyticsPostDTO, PublisherAnalyticsPutDTO, PublisherAnalyticsMapper> {

    public PublisherAnalyticsController(PublisherAnalyticsRepository repository, PublisherAnalyticsMapper mapper) {
        super(repository, mapper);
    }
}
