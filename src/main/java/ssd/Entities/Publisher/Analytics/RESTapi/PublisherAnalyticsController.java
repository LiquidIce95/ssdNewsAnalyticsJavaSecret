package ssd.Entities.Publisher.Analytics.RESTapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ssd.Entities.Publisher.Analytics.PublisherAnalytics;
import ssd.Entities.Publisher.Analytics.PublisherAnalyticsRepository;
import ssd.Entities.Publisher.PublisherMapper;
import ssd.Entities.Publisher.Base.Publisher;
import ssd.Entities.Publisher.Base.RESTapi.PublisherDTO;
import ssd.Entities.Publisher.Raw.PublisherRaw;
import ssd.Entities.Publisher.Raw.RESTapi.PublisherRawDTO;
import ssd.AbstractClasses.Analytics.RESTapi.AnalyticsController;

@RestController
@RequestMapping("/publisher-analytics")
public class PublisherAnalyticsController extends AnalyticsController<PublisherAnalytics, PublisherAnalyticsDTO, Publisher, PublisherDTO, PublisherRaw, PublisherRawDTO, PublisherAnalyticsRepository, PublisherMapper> {

    public PublisherAnalyticsController(PublisherAnalyticsRepository repository) {
        super(repository, new PublisherMapper());
    }
}
