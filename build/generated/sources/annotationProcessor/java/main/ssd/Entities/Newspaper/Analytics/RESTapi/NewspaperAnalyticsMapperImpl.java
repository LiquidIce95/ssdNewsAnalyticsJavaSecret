package ssd.Entities.Newspaper.Analytics.RESTapi;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ssd.Entities.Newspaper.Analytics.NewspaperAnalytics;
import ssd.Entities.Newspaper.Analytics.RESTapi.DTO.NewspaperAnalyticsGetDTO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-13T14:13:04+0200",
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
}
