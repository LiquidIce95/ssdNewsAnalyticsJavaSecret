package ssd.Entities.Newspaper;

import ssd.AbstractClasses.AbstractMapper;
import ssd.Entities.Newspaper.Analytics.NewspaperAnalytics;
import ssd.Entities.Newspaper.Analytics.RESTapi.NewspaperAnalyticsDTO;
import ssd.Entities.Newspaper.Base.Newspaper;
import ssd.Entities.Newspaper.Base.RESTapi.NewspaperDTO;
import ssd.Entities.Newspaper.Raw.NewspaperRaw;
import ssd.Entities.Newspaper.Raw.RESTapi.NewspaperRawDTO;
import org.springframework.stereotype.Component;

@Component
public class NewspaperMapper extends AbstractMapper<
        NewspaperAnalytics, NewspaperAnalyticsDTO,
        Newspaper, NewspaperDTO,
        NewspaperRaw, NewspaperRawDTO> {

    // Constructor that passes the class types to the superclass constructor
    public NewspaperMapper() {
        super(
            NewspaperAnalytics.class,
            NewspaperAnalyticsDTO.class,
            Newspaper.class,
            NewspaperDTO.class,
            NewspaperRaw.class,
            NewspaperRawDTO.class
        );
    }

    // No additional logic required, as all mapping functions are inherited
}
