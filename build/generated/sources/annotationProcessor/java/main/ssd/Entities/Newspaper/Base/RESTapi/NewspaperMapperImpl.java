package ssd.Entities.Newspaper.Base.RESTapi;

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

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-13T17:29:07+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 17.0.10 (Debian)"
)
@Component
public class NewspaperMapperImpl implements NewspaperMapper {

    @Override
    public NewspaperGetDTO convertEntityToGetDTO(Newspaper newspaper) {
        if ( newspaper == null ) {
            return null;
        }

        NewspaperGetDTO newspaperGetDTO = new NewspaperGetDTO();

        newspaperGetDTO.setAnalytics( newspaperAnalyticsToNewspaperAnalyticsGetDTO( newspaper.getAnalytics() ) );
        newspaperGetDTO.setName( newspaper.getName() );
        newspaperGetDTO.setId( newspaper.getId() );

        return newspaperGetDTO;
    }

    @Override
    public Newspaper convertPostDTOToEntity(NewspaperPostDTO postDTO) {
        if ( postDTO == null ) {
            return null;
        }

        Newspaper newspaper = new Newspaper();

        newspaper.setAnalytics( newspaperAnalyticsPostDTOToNewspaperAnalytics( postDTO.getAnalytics() ) );
        newspaper.setName( postDTO.getName() );

        return newspaper;
    }

    @Override
    public Newspaper updateEntityFromPutDTO(NewspaperPutDTO putDTO, Newspaper newspaper) {
        if ( putDTO == null && newspaper == null ) {
            return null;
        }

        Newspaper newspaper1 = new Newspaper();

        if ( putDTO != null ) {
            newspaper1.setAnalytics( newspaperAnalyticsPutDTOToNewspaperAnalytics( putDTO.getAnalytics() ) );
            newspaper1.setName( putDTO.getName() );
        }

        return newspaper1;
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
}
