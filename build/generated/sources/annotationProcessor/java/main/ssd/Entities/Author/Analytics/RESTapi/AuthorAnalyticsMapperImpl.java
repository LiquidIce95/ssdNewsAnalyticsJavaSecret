package ssd.Entities.Author.Analytics.RESTapi;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ssd.Entities.Author.Analytics.AuthorAnalytics;
import ssd.Entities.Author.Analytics.RESTapi.DTO.AuthorAnalyticsGetDTO;
import ssd.Entities.Author.Analytics.RESTapi.DTO.AuthorAnalyticsPostDTO;
import ssd.Entities.Author.Analytics.RESTapi.DTO.AuthorAnalyticsPutDTO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-13T17:29:08+0200",
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

    @Override
    public AuthorAnalytics convertPostDTOToEntity(AuthorAnalyticsPostDTO postDTO) {
        if ( postDTO == null ) {
            return null;
        }

        AuthorAnalytics authorAnalytics = new AuthorAnalytics();

        authorAnalytics.setBias( postDTO.getBias() );
        authorAnalytics.setViews( postDTO.getViews() );
        authorAnalytics.setShares( postDTO.getShares() );
        authorAnalytics.setLikes( postDTO.getLikes() );
        authorAnalytics.setEngagementRate( postDTO.getEngagementRate() );

        return authorAnalytics;
    }

    @Override
    public AuthorAnalytics updateEntityFromPutDTO(AuthorAnalyticsPutDTO putDTO, AuthorAnalytics authorAnalytics) {
        if ( putDTO == null && authorAnalytics == null ) {
            return null;
        }

        AuthorAnalytics authorAnalytics1 = new AuthorAnalytics();

        if ( putDTO != null ) {
            authorAnalytics1.setShares( putDTO.getShares() );
            authorAnalytics1.setEngagementRate( putDTO.getEngagementRate() );
            authorAnalytics1.setBias( putDTO.getBias() );
            authorAnalytics1.setViews( putDTO.getViews() );
            authorAnalytics1.setLikes( putDTO.getLikes() );
        }

        return authorAnalytics1;
    }
}
