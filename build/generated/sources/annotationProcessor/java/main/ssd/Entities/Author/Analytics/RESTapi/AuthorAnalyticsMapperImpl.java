package ssd.Entities.Author.Analytics.RESTapi;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ssd.Entities.Author.Analytics.AuthorAnalytics;
import ssd.Entities.Author.Analytics.RESTapi.DTO.AuthorAnalyticsGetDTO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-13T14:13:04+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 17.0.10 (Debian)"
)
@Component
public class AuthorAnalyticsMapperImpl implements AuthorAnalyticsMapper {

    @Override
    public AuthorAnalyticsGetDTO convertEntityToGetDTO(AuthorAnalytics authorAnalytics) {
        if ( authorAnalytics == null ) {
            return null;
        }

        AuthorAnalyticsGetDTO authorAnalyticsGetDTO = new AuthorAnalyticsGetDTO();

        authorAnalyticsGetDTO.setShares( authorAnalytics.getShares() );
        authorAnalyticsGetDTO.setEngagementRate( authorAnalytics.getEngagementRate() );
        authorAnalyticsGetDTO.setBias( authorAnalytics.getBias() );
        authorAnalyticsGetDTO.setId( authorAnalytics.getId() );
        authorAnalyticsGetDTO.setViews( authorAnalytics.getViews() );
        authorAnalyticsGetDTO.setLikes( authorAnalytics.getLikes() );

        return authorAnalyticsGetDTO;
    }
}
