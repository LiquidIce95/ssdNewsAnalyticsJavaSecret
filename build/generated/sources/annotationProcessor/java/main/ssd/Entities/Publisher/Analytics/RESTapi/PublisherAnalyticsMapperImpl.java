package ssd.Entities.Publisher.Analytics.RESTapi;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ssd.Entities.Publisher.Analytics.PublisherAnalytics;
import ssd.Entities.Publisher.Analytics.RESTapi.DTO.PublisherAnalyticsGetDTO;
import ssd.Entities.Publisher.Analytics.RESTapi.DTO.PublisherAnalyticsPostDTO;
import ssd.Entities.Publisher.Analytics.RESTapi.DTO.PublisherAnalyticsPutDTO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-13T17:29:08+0200",
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

    @Override
    public PublisherAnalytics convertPostDTOToEntity(PublisherAnalyticsPostDTO postDTO) {
        if ( postDTO == null ) {
            return null;
        }

        PublisherAnalytics publisherAnalytics = new PublisherAnalytics();

        publisherAnalytics.setBias( postDTO.getBias() );
        publisherAnalytics.setViews( postDTO.getViews() );
        publisherAnalytics.setShares( postDTO.getShares() );
        publisherAnalytics.setLikes( postDTO.getLikes() );
        publisherAnalytics.setEngagementRate( postDTO.getEngagementRate() );

        return publisherAnalytics;
    }

    @Override
    public PublisherAnalytics updateEntityFromPutDTO(PublisherAnalyticsPutDTO putDTO, PublisherAnalytics publisherAnalytics) {
        if ( putDTO == null && publisherAnalytics == null ) {
            return null;
        }

        PublisherAnalytics publisherAnalytics1 = new PublisherAnalytics();

        if ( putDTO != null ) {
            publisherAnalytics1.setShares( putDTO.getShares() );
            publisherAnalytics1.setEngagementRate( putDTO.getEngagementRate() );
            publisherAnalytics1.setBias( putDTO.getBias() );
            publisherAnalytics1.setViews( putDTO.getViews() );
            publisherAnalytics1.setLikes( putDTO.getLikes() );
        }

        return publisherAnalytics1;
    }
}
