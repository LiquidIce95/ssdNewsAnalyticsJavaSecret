package ssd.Entities.Newspaper.Raw.RESTapi;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ssd.Entities.Newspaper.Analytics.NewspaperAnalytics;
import ssd.Entities.Newspaper.Analytics.RESTapi.DTO.NewspaperAnalyticsGetDTO;
import ssd.Entities.Newspaper.Analytics.RESTapi.DTO.NewspaperAnalyticsPostDTO;
import ssd.Entities.Newspaper.Analytics.RESTapi.DTO.NewspaperAnalyticsPutDTO;
import ssd.Entities.Newspaper.Base.Newspaper;
import ssd.Entities.Newspaper.Base.RESTapi.DTO.NewspaperGetDTO;
import ssd.Entities.Newspaper.Base.RESTapi.DTO.NewspaperPostDTO;
import ssd.Entities.Newspaper.Base.RESTapi.DTO.NewspaperPutDTO;
import ssd.Entities.Newspaper.Raw.NewspaperRaw;
import ssd.Entities.Newspaper.Raw.RESTapi.DTO.NewspaperRawGetDTO;
import ssd.Entities.Newspaper.Raw.RESTapi.DTO.NewspaperRawPostDTO;
import ssd.Entities.Newspaper.Raw.RESTapi.DTO.NewspaperRawPutDTO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-13T17:29:08+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 17.0.10 (Debian)"
)
@Component
public class NewspaperRawMapperImpl implements NewspaperRawMapper {

    @Override
    public NewspaperRawGetDTO convertEntityToGetDTO(NewspaperRaw newspaperRaw) {
        if ( newspaperRaw == null ) {
            return null;
        }

        NewspaperRawGetDTO newspaperRawGetDTO = new NewspaperRawGetDTO();

        newspaperRawGetDTO.setDate( newspaperRaw.getDate() );
        newspaperRawGetDTO.setId( newspaperRaw.getId() );
        newspaperRawGetDTO.setScrapeContent( newspaperRaw.getScrapeContent() );
        newspaperRawGetDTO.setUrl( newspaperRaw.getUrl() );
        newspaperRawGetDTO.setBaseEntity( newspaperToNewspaperGetDTO( newspaperRaw.getBaseEntity() ) );

        return newspaperRawGetDTO;
    }

    @Override
    public NewspaperRaw convertPostDTOToEntity(NewspaperRawPostDTO postDTO) {
        if ( postDTO == null ) {
            return null;
        }

        NewspaperRaw newspaperRaw = new NewspaperRaw();

        newspaperRaw.setScrapeContent( postDTO.getScrapeContent() );
        newspaperRaw.setDate( postDTO.getDate() );
        newspaperRaw.setUrl( postDTO.getUrl() );
        newspaperRaw.setBaseEntity( newspaperPostDTOToNewspaper( postDTO.getBaseEntity() ) );

        return newspaperRaw;
    }

    @Override
    public NewspaperRaw updateEntityFromPutDTO(NewspaperRawPutDTO putDTO, NewspaperRaw newspaperRaw) {
        if ( putDTO == null && newspaperRaw == null ) {
            return null;
        }

        NewspaperRaw newspaperRaw1 = new NewspaperRaw();

        if ( putDTO != null ) {
            newspaperRaw1.setDate( putDTO.getDate() );
            newspaperRaw1.setScrapeContent( putDTO.getScrapeContent() );
            newspaperRaw1.setUrl( putDTO.getUrl() );
            newspaperRaw1.setBaseEntity( newspaperPutDTOToNewspaper( putDTO.getBaseEntity() ) );
        }

        return newspaperRaw1;
    }

    protected NewspaperAnalyticsGetDTO newspaperAnalyticsToNewspaperAnalyticsGetDTO(NewspaperAnalytics newspaperAnalytics) {
        if ( newspaperAnalytics == null ) {
            return null;
        }

        NewspaperAnalyticsGetDTO newspaperAnalyticsGetDTO = new NewspaperAnalyticsGetDTO();

        newspaperAnalyticsGetDTO.setId( newspaperAnalytics.getId() );
        newspaperAnalyticsGetDTO.setBias( newspaperAnalytics.getBias() );
        newspaperAnalyticsGetDTO.setViews( newspaperAnalytics.getViews() );
        newspaperAnalyticsGetDTO.setShares( newspaperAnalytics.getShares() );
        newspaperAnalyticsGetDTO.setLikes( newspaperAnalytics.getLikes() );
        newspaperAnalyticsGetDTO.setEngagementRate( newspaperAnalytics.getEngagementRate() );

        return newspaperAnalyticsGetDTO;
    }

    protected NewspaperGetDTO newspaperToNewspaperGetDTO(Newspaper newspaper) {
        if ( newspaper == null ) {
            return null;
        }

        NewspaperGetDTO newspaperGetDTO = new NewspaperGetDTO();

        newspaperGetDTO.setId( newspaper.getId() );
        newspaperGetDTO.setName( newspaper.getName() );
        newspaperGetDTO.setAnalytics( newspaperAnalyticsToNewspaperAnalyticsGetDTO( newspaper.getAnalytics() ) );

        return newspaperGetDTO;
    }

    protected NewspaperAnalytics newspaperAnalyticsPostDTOToNewspaperAnalytics(NewspaperAnalyticsPostDTO newspaperAnalyticsPostDTO) {
        if ( newspaperAnalyticsPostDTO == null ) {
            return null;
        }

        NewspaperAnalytics newspaperAnalytics = new NewspaperAnalytics();

        newspaperAnalytics.setBias( newspaperAnalyticsPostDTO.getBias() );
        newspaperAnalytics.setViews( newspaperAnalyticsPostDTO.getViews() );
        newspaperAnalytics.setShares( newspaperAnalyticsPostDTO.getShares() );
        newspaperAnalytics.setLikes( newspaperAnalyticsPostDTO.getLikes() );
        newspaperAnalytics.setEngagementRate( newspaperAnalyticsPostDTO.getEngagementRate() );

        return newspaperAnalytics;
    }

    protected Newspaper newspaperPostDTOToNewspaper(NewspaperPostDTO newspaperPostDTO) {
        if ( newspaperPostDTO == null ) {
            return null;
        }

        Newspaper newspaper = new Newspaper();

        newspaper.setName( newspaperPostDTO.getName() );
        newspaper.setAnalytics( newspaperAnalyticsPostDTOToNewspaperAnalytics( newspaperPostDTO.getAnalytics() ) );

        return newspaper;
    }

    protected NewspaperAnalytics newspaperAnalyticsPutDTOToNewspaperAnalytics(NewspaperAnalyticsPutDTO newspaperAnalyticsPutDTO) {
        if ( newspaperAnalyticsPutDTO == null ) {
            return null;
        }

        NewspaperAnalytics newspaperAnalytics = new NewspaperAnalytics();

        newspaperAnalytics.setBias( newspaperAnalyticsPutDTO.getBias() );
        newspaperAnalytics.setViews( newspaperAnalyticsPutDTO.getViews() );
        newspaperAnalytics.setShares( newspaperAnalyticsPutDTO.getShares() );
        newspaperAnalytics.setLikes( newspaperAnalyticsPutDTO.getLikes() );
        newspaperAnalytics.setEngagementRate( newspaperAnalyticsPutDTO.getEngagementRate() );
        newspaperAnalytics.setId( newspaperAnalyticsPutDTO.getId() );

        return newspaperAnalytics;
    }

    protected Newspaper newspaperPutDTOToNewspaper(NewspaperPutDTO newspaperPutDTO) {
        if ( newspaperPutDTO == null ) {
            return null;
        }

        Newspaper newspaper = new Newspaper();

        newspaper.setId( newspaperPutDTO.getId() );
        newspaper.setName( newspaperPutDTO.getName() );
        newspaper.setAnalytics( newspaperAnalyticsPutDTOToNewspaperAnalytics( newspaperPutDTO.getAnalytics() ) );

        return newspaper;
    }
}
