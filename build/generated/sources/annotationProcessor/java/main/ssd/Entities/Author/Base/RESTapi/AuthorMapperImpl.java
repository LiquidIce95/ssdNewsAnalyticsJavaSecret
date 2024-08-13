package ssd.Entities.Author.Base.RESTapi;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ssd.Entities.Author.Analytics.AuthorAnalytics;
import ssd.Entities.Author.Analytics.RESTapi.DTO.AuthorAnalyticsGetDTO;
import ssd.Entities.Author.Analytics.RESTapi.DTO.AuthorAnalyticsPostDTO;
import ssd.Entities.Author.Analytics.RESTapi.DTO.AuthorAnalyticsPutDTO;
import ssd.Entities.Author.Base.Author;
import ssd.Entities.Author.Base.RESTapi.DTO.AuthorGetDTO;
import ssd.Entities.Author.Base.RESTapi.DTO.AuthorPostDTO;
import ssd.Entities.Author.Base.RESTapi.DTO.AuthorPutDTO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-13T17:29:08+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 17.0.10 (Debian)"
)
@Component
public class AuthorMapperImpl implements AuthorMapper {

    @Override
    public AuthorGetDTO convertEntityToGetDTO(Author author) {
        if ( author == null ) {
            return null;
        }

        AuthorGetDTO authorGetDTO = new AuthorGetDTO();

        authorGetDTO.setAnalytics( authorAnalyticsToAuthorAnalyticsGetDTO( author.getAnalytics() ) );
        authorGetDTO.setName( author.getName() );
        authorGetDTO.setId( author.getId() );

        return authorGetDTO;
    }

    @Override
    public Author convertPostDTOToEntity(AuthorPostDTO postDTO) {
        if ( postDTO == null ) {
            return null;
        }

        Author author = new Author();

        author.setAnalytics( authorAnalyticsPostDTOToAuthorAnalytics( postDTO.getAnalytics() ) );
        author.setName( postDTO.getName() );

        return author;
    }

    @Override
    public Author updateEntityFromPutDTO(AuthorPutDTO putDTO, Author author) {
        if ( putDTO == null && author == null ) {
            return null;
        }

        Author author1 = new Author();

        if ( putDTO != null ) {
            author1.setAnalytics( authorAnalyticsPutDTOToAuthorAnalytics( putDTO.getAnalytics() ) );
            author1.setName( putDTO.getName() );
        }

        return author1;
    }

    protected AuthorAnalyticsGetDTO authorAnalyticsToAuthorAnalyticsGetDTO(AuthorAnalytics authorAnalytics) {
        if ( authorAnalytics == null ) {
            return null;
        }

        AuthorAnalyticsGetDTO authorAnalyticsGetDTO = new AuthorAnalyticsGetDTO();

        authorAnalyticsGetDTO.setId( authorAnalytics.getId() );
        authorAnalyticsGetDTO.setBias( authorAnalytics.getBias() );
        authorAnalyticsGetDTO.setViews( authorAnalytics.getViews() );
        authorAnalyticsGetDTO.setShares( authorAnalytics.getShares() );
        authorAnalyticsGetDTO.setLikes( authorAnalytics.getLikes() );
        authorAnalyticsGetDTO.setEngagementRate( authorAnalytics.getEngagementRate() );

        return authorAnalyticsGetDTO;
    }

    protected AuthorAnalytics authorAnalyticsPostDTOToAuthorAnalytics(AuthorAnalyticsPostDTO authorAnalyticsPostDTO) {
        if ( authorAnalyticsPostDTO == null ) {
            return null;
        }

        AuthorAnalytics authorAnalytics = new AuthorAnalytics();

        authorAnalytics.setBias( authorAnalyticsPostDTO.getBias() );
        authorAnalytics.setViews( authorAnalyticsPostDTO.getViews() );
        authorAnalytics.setShares( authorAnalyticsPostDTO.getShares() );
        authorAnalytics.setLikes( authorAnalyticsPostDTO.getLikes() );
        authorAnalytics.setEngagementRate( authorAnalyticsPostDTO.getEngagementRate() );

        return authorAnalytics;
    }

    protected AuthorAnalytics authorAnalyticsPutDTOToAuthorAnalytics(AuthorAnalyticsPutDTO authorAnalyticsPutDTO) {
        if ( authorAnalyticsPutDTO == null ) {
            return null;
        }

        AuthorAnalytics authorAnalytics = new AuthorAnalytics();

        authorAnalytics.setBias( authorAnalyticsPutDTO.getBias() );
        authorAnalytics.setViews( authorAnalyticsPutDTO.getViews() );
        authorAnalytics.setShares( authorAnalyticsPutDTO.getShares() );
        authorAnalytics.setLikes( authorAnalyticsPutDTO.getLikes() );
        authorAnalytics.setEngagementRate( authorAnalyticsPutDTO.getEngagementRate() );
        authorAnalytics.setId( authorAnalyticsPutDTO.getId() );

        return authorAnalytics;
    }
}
