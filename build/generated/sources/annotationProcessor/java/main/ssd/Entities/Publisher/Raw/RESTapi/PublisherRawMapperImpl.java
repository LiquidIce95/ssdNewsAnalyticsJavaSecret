package ssd.Entities.Publisher.Raw.RESTapi;

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
import ssd.Entities.Publisher.Raw.PublisherRaw;
import ssd.Entities.Publisher.Raw.RESTapi.DTO.PublisherRawGetDTO;
import ssd.Entities.Publisher.Raw.RESTapi.DTO.PublisherRawPostDTO;
import ssd.Entities.Publisher.Raw.RESTapi.DTO.PublisherRawPutDTO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-13T17:29:08+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 17.0.10 (Debian)"
)
@Component
public class PublisherRawMapperImpl implements PublisherRawMapper {

    @Override
    public PublisherRawGetDTO convertEntityToGetDTO(PublisherRaw publisherRaw) {
        if ( publisherRaw == null ) {
            return null;
        }

        PublisherRawGetDTO publisherRawGetDTO = new PublisherRawGetDTO();

        publisherRawGetDTO.setDate( publisherRaw.getDate() );
        publisherRawGetDTO.setId( publisherRaw.getId() );
        publisherRawGetDTO.setScrapeContent( publisherRaw.getScrapeContent() );
        publisherRawGetDTO.setUrl( publisherRaw.getUrl() );
        publisherRawGetDTO.setBaseEntity( publisherToPublisherGetDTO( publisherRaw.getBaseEntity() ) );

        return publisherRawGetDTO;
    }

    @Override
    public PublisherRaw convertPostDTOToEntity(PublisherRawPostDTO postDTO) {
        if ( postDTO == null ) {
            return null;
        }

        PublisherRaw publisherRaw = new PublisherRaw();

        publisherRaw.setScrapeContent( postDTO.getScrapeContent() );
        publisherRaw.setDate( postDTO.getDate() );
        publisherRaw.setUrl( postDTO.getUrl() );
        publisherRaw.setBaseEntity( publisherPostDTOToPublisher( postDTO.getBaseEntity() ) );

        return publisherRaw;
    }

    @Override
    public PublisherRaw updateEntityFromPutDTO(PublisherRawPutDTO putDTO, PublisherRaw publisherRaw) {
        if ( putDTO == null && publisherRaw == null ) {
            return null;
        }

        PublisherRaw publisherRaw1 = new PublisherRaw();

        if ( putDTO != null ) {
            publisherRaw1.setDate( putDTO.getDate() );
            publisherRaw1.setScrapeContent( putDTO.getScrapeContent() );
            publisherRaw1.setUrl( putDTO.getUrl() );
            publisherRaw1.setBaseEntity( publisherPutDTOToPublisher( putDTO.getBaseEntity() ) );
        }

        return publisherRaw1;
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

    protected PublisherGetDTO publisherToPublisherGetDTO(Publisher publisher) {
        if ( publisher == null ) {
            return null;
        }

        PublisherGetDTO publisherGetDTO = new PublisherGetDTO();

        publisherGetDTO.setId( publisher.getId() );
        publisherGetDTO.setName( publisher.getName() );
        publisherGetDTO.setAnalytics( publisherAnalyticsToPublisherAnalyticsGetDTO( publisher.getAnalytics() ) );

        return publisherGetDTO;
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

    protected Publisher publisherPostDTOToPublisher(PublisherPostDTO publisherPostDTO) {
        if ( publisherPostDTO == null ) {
            return null;
        }

        Publisher publisher = new Publisher();

        publisher.setName( publisherPostDTO.getName() );
        publisher.setAnalytics( publisherAnalyticsPostDTOToPublisherAnalytics( publisherPostDTO.getAnalytics() ) );

        return publisher;
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

    protected Publisher publisherPutDTOToPublisher(PublisherPutDTO publisherPutDTO) {
        if ( publisherPutDTO == null ) {
            return null;
        }

        Publisher publisher = new Publisher();

        publisher.setId( publisherPutDTO.getId() );
        publisher.setName( publisherPutDTO.getName() );
        publisher.setAnalytics( publisherAnalyticsPutDTOToPublisherAnalytics( publisherPutDTO.getAnalytics() ) );

        return publisher;
    }
}
