package ssd.Entities.Newspaper.Analytics.RESTapi;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ssd.Entities.Newspaper.Analytics.NewspaperAnalytics;
import ssd.Entities.Newspaper.Analytics.RESTapi.DTO.NewspaperAnalyticsGetDTO;
import ssd.Entities.Newspaper.Analytics.RESTapi.DTO.NewspaperAnalyticsPostDTO;
import ssd.Entities.Newspaper.Analytics.RESTapi.DTO.NewspaperAnalyticsPutDTO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-13T17:29:08+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 17.0.10 (Debian)"
)
@Component
public class NewspaperAnalyticsMapperImpl implements NewspaperAnalyticsMapper {

    @Override
    public NewspaperAnalyticsGetDTO convertEntityToGetDTO(NewspaperAnalytics newspaperAnalytics) {
        if ( newspaperAnalytics == null ) {
            return null;
        }

        NewspaperAnalyticsGetDTO newspaperAnalyticsGetDTO = new NewspaperAnalyticsGetDTO();

        newspaperAnalyticsGetDTO.setShares( newspaperAnalytics.getShares() );
        newspaperAnalyticsGetDTO.setEngagementRate( newspaperAnalytics.getEngagementRate() );
        newspaperAnalyticsGetDTO.setBias( newspaperAnalytics.getBias() );
        newspaperAnalyticsGetDTO.setId( newspaperAnalytics.getId() );
        newspaperAnalyticsGetDTO.setViews( newspaperAnalytics.getViews() );
        newspaperAnalyticsGetDTO.setLikes( newspaperAnalytics.getLikes() );

        return newspaperAnalyticsGetDTO;
    }

    @Override
    public NewspaperAnalytics convertPostDTOToEntity(NewspaperAnalyticsPostDTO postDTO) {
        if ( postDTO == null ) {
            return null;
        }

        NewspaperAnalytics newspaperAnalytics = new NewspaperAnalytics();

        newspaperAnalytics.setBias( postDTO.getBias() );
        newspaperAnalytics.setViews( postDTO.getViews() );
        newspaperAnalytics.setShares( postDTO.getShares() );
        newspaperAnalytics.setLikes( postDTO.getLikes() );
        newspaperAnalytics.setEngagementRate( postDTO.getEngagementRate() );

        return newspaperAnalytics;
    }

    @Override
    public NewspaperAnalytics updateEntityFromPutDTO(NewspaperAnalyticsPutDTO putDTO, NewspaperAnalytics newspaperAnalytics) {
        if ( putDTO == null && newspaperAnalytics == null ) {
            return null;
        }

        NewspaperAnalytics newspaperAnalytics1 = new NewspaperAnalytics();

        if ( putDTO != null ) {
            newspaperAnalytics1.setShares( putDTO.getShares() );
            newspaperAnalytics1.setEngagementRate( putDTO.getEngagementRate() );
            newspaperAnalytics1.setBias( putDTO.getBias() );
            newspaperAnalytics1.setViews( putDTO.getViews() );
            newspaperAnalytics1.setLikes( putDTO.getLikes() );
        }

        return newspaperAnalytics1;
    }
}
