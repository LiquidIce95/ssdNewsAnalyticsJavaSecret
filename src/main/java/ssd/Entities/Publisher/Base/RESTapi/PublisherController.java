package ssd.Entities.Publisher.Base.RESTapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ssd.Entities.Publisher.Base.Publisher;
import ssd.Entities.Publisher.Base.PublisherRepository;
import ssd.Entities.Publisher.Raw.PublisherRaw;
import ssd.Entities.Publisher.Raw.RESTapi.PublisherRawDTO;
import ssd.Entities.Publisher.PublisherMapper;
import ssd.Entities.Publisher.Analytics.PublisherAnalytics;
import ssd.Entities.Publisher.Analytics.RESTapi.PublisherAnalyticsDTO;
import ssd.AbstractClasses.Base.RESTapi.BaseEntityController;

@RestController
@RequestMapping("/publishers")
public class PublisherController extends BaseEntityController<PublisherAnalytics, PublisherAnalyticsDTO, Publisher, PublisherDTO, PublisherRaw, PublisherRawDTO, PublisherRepository, PublisherMapper> {

    public PublisherController(PublisherRepository repository) {
        super(repository, new PublisherMapper());
    }
}
