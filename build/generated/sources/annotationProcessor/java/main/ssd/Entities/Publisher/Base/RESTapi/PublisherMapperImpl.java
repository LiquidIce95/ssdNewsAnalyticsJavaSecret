package ssd.Entities.Publisher.Base.RESTapi;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ssd.Entities.Publisher.Analytics.PublisherAnalytics;
import ssd.Entities.Publisher.Analytics.RESTapi.DTO.PublisherAnalyticsGetDTO;
import ssd.Entities.Publisher.Analytics.RESTapi.DTO.PublisherAnalyticsPostDTO;
import ssd.Entities.Publisher.Analytics.RESTapi.DTO.PublisherAnalyticsPutDTO;
import ssd.Entities.Publisher.Base.Publisher;
import ssd.Entities.Publisher.Base.RESTapi.DTO.PublisherGetDTO;
import ssd.Entities.Publisher.Base.RESTapi.DTO.PublisherPostDTO;
import ssd.Entities.Publisher.Base.RESTapi.DTO.PublisherPutDTO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-13T17:29:08+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 17.0.10 (Debian)"
)
@Component
public class PublisherMapperImpl implements PublisherMapper {

    @Override
    public PublisherGetDTO convertEntityToGetDTO(Publisher publisher) {
        if ( publisher == null ) {
            return null;
        }

        PublisherGetDTO publisherGetDTO = new PublisherGetDTO();

        publisherGetDTO.setAnalytics( publisherAnalyticsToPublisherAnalyticsGetDTO( publisher.getAnalytics() ) );
        publisherGetDTO.setName( publisher.getName() );
        publisherGetDTO.setId( publisher.getId() );

        return publisherGetDTO;
    }

    @Override
    public Publisher convertPostDTOToEntity(PublisherPostDTO postDTO) {
        if ( postDTO == null ) {
            return null;
        }

        Publisher publisher = new Publisher();

        publisher.setAnalytics( publisherAnalyticsPostDTOToPublisherAnalytics( postDTO.getAnalytics() ) );
        publisher.setName( postDTO.getName() );

        return publisher;
    }

    @Override
    public Publisher updateEntityFromPutDTO(PublisherPutDTO putDTO, Publisher publisher) {
        if ( putDTO == null && publisher == null ) {
            return null;
        }

        Publisher publisher1 = new Publisher();

        if ( putDTO != null ) {
            publisher1.setAnalytics( publisherAnalyticsPutDTOToPublisherAnalytics( putDTO.getAnalytics() ) );
            publisher1.setName( putDTO.getName() );
        }

        return publisher1;
    }

    protected PublisherAnalyticsGetDTO publisherAnalyticsToPublisherAnalyticsGetDTO(PublisherAnalytics publisherAnalytics) {
        if ( publisherAnalytics == null ) {
            return null;
        }

        PublisherAnalyticsGetDTO publisherAnalyticsGetDTO = new PublisherAnalyticsGetDTO();

        publisherAnalyticsGetDTO.setId( publisherAnalytics.getId() );
        publisherAnalyticsGetDTO.setBias( publisherAnalytics.getBias() );
        publisherAnalyticsGetDTO.setViews( publisherAnalytics.getViews() );
        publisherAnalyticsGetDTO.setShares( publisherAnalytics.getShares() );
        publisherAnalyticsGetDTO.setLikes( publisherAnalytics.getLikes() );
        publisherAnalyticsGetDTO.setEngagementRate( publisherAnalytics.getEngagementRate() );

        return publisherAnalyticsGetDTO;
    }

    protected PublisherAnalytics publisherAnalyticsPostDTOToPublisherAnalytics(PublisherAnalyticsPostDTO publisherAnalyticsPostDTO) {
        if ( publisherAnalyticsPostDTO == null ) {
            return null;
        }

        PublisherAnalytics publisherAnalytics = new PublisherAnalytics();

        publisherAnalytics.setBias( publisherAnalyticsPostDTO.getBias() );
        publisherAnalytics.setViews( publisherAnalyticsPostDTO.getViews() );
        publisherAnalytics.setShares( publisherAnalyticsPostDTO.getShares() );
        publisherAnalytics.setLikes( publisherAnalyticsPostDTO.getLikes() );
        publisherAnalytics.setEngagementRate( publisherAnalyticsPostDTO.getEngagementRate() );

        return publisherAnalytics;
    }

    protected PublisherAnalytics publisherAnalyticsPutDTOToPublisherAnalytics(PublisherAnalyticsPutDTO publisherAnalyticsPutDTO) {
        if ( publisherAnalyticsPutDTO == null ) {
            return null;
        }

        PublisherAnalytics publisherAnalytics = new PublisherAnalytics();

        publisherAnalytics.setBias( publisherAnalyticsPutDTO.getBias() );
        publisherAnalytics.setViews( publisherAnalyticsPutDTO.getViews() );
        publisherAnalytics.setShares( publisherAnalyticsPutDTO.getShares() );
        publisherAnalytics.setLikes( publisherAnalyticsPutDTO.getLikes() );
        publisherAnalytics.setEngagementRate( publisherAnalyticsPutDTO.getEngagementRate() );
        publisherAnalytics.setId( publisherAnalyticsPutDTO.getId() );

        return publisherAnalytics;
    }
}
