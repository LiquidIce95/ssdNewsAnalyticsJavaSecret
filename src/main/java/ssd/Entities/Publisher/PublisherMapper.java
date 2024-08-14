package ssd.Entities.Publisher;

import ssd.AbstractClasses.AbstractMapper;
import ssd.Entities.Publisher.Analytics.PublisherAnalytics;
import ssd.Entities.Publisher.Analytics.RESTapi.PublisherAnalyticsDTO;
import ssd.Entities.Publisher.Base.Publisher;
import ssd.Entities.Publisher.Base.RESTapi.PublisherDTO;
import ssd.Entities.Publisher.Raw.PublisherRaw;
import ssd.Entities.Publisher.Raw.RESTapi.PublisherRawDTO;
import org.springframework.stereotype.Component;

@Component
public class PublisherMapper extends AbstractMapper<
        PublisherAnalytics, PublisherAnalyticsDTO,
        Publisher, PublisherDTO,
        PublisherRaw, PublisherRawDTO> {

    // Constructor that passes the class types to the superclass constructor
    public PublisherMapper() {
        super(
            PublisherAnalytics.class,
            PublisherAnalyticsDTO.class,
            Publisher.class,
            PublisherDTO.class,
            PublisherRaw.class,
            PublisherRawDTO.class
        );
    }

    // No additional logic required, as all mapping functions are inherited
}
