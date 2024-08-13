package ssd.Entities.Publisher.Analytics.RESTapi;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ssd.Entities.Publisher.Analytics.PublisherAnalytics;
import ssd.Entities.Publisher.Analytics.RESTapi.DTO.PublisherAnalyticsGetDTO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-13T15:22:00+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 17.0.10 (Debian)"
)
@Component
public class PublisherAnalyticsMapperImpl implements PublisherAnalyticsMapper {

    @Override
    public PublisherAnalyticsGetDTO convertEntityToGetDTO(PublisherAnalytics publisherAnalytics) {
        if ( publisherAnalytics == null ) {
            return null;
        }

        PublisherAnalyticsGetDTO publisherAnalyticsGetDTO = new PublisherAnalyticsGetDTO();

        publisherAnalyticsGetDTO.setShares( publisherAnalytics.getShares() );
        publisherAnalyticsGetDTO.setEngagementRate( publisherAnalytics.getEngagementRate() );
        publisherAnalyticsGetDTO.setBias( publisherAnalytics.getBias() );
        publisherAnalyticsGetDTO.setId( publisherAnalytics.getId() );
        publisherAnalyticsGetDTO.setViews( publisherAnalytics.getViews() );
        publisherAnalyticsGetDTO.setLikes( publisherAnalytics.getLikes() );

        return publisherAnalyticsGetDTO;
    }
}
