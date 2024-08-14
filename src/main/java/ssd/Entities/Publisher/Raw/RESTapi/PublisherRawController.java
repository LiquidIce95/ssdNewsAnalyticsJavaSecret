package ssd.Entities.Publisher.Raw.RESTapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ssd.Entities.Publisher.Raw.PublisherRaw;
import ssd.Entities.Publisher.Raw.PublisherRawRepository;
import ssd.Entities.Publisher.PublisherMapper;
import ssd.Entities.Publisher.Base.Publisher;
import ssd.Entities.Publisher.Base.RESTapi.PublisherDTO;
import ssd.Entities.Publisher.Analytics.PublisherAnalytics;
import ssd.Entities.Publisher.Analytics.RESTapi.PublisherAnalyticsDTO;
import ssd.AbstractClasses.Raw.RESTapi.EntityRawController;

@RestController
@RequestMapping("/publisher-raws")
public class PublisherRawController extends EntityRawController<PublisherAnalytics, PublisherAnalyticsDTO, Publisher, PublisherDTO, PublisherRaw, PublisherRawDTO, PublisherRawRepository, PublisherMapper> {

    public PublisherRawController(PublisherRawRepository repository) {
        super(repository, new PublisherMapper());
    }
}
