package ssd.Entities.Author.Raw.RESTapi;

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
import ssd.Entities.Author.Raw.AuthorRaw;
import ssd.Entities.Author.Raw.RESTapi.DTO.AuthorRawGetDTO;
import ssd.Entities.Author.Raw.RESTapi.DTO.AuthorRawPostDTO;
import ssd.Entities.Author.Raw.RESTapi.DTO.AuthorRawPutDTO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-13T17:29:08+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 17.0.10 (Debian)"
)
@Component
public class AuthorRawMapperImpl implements AuthorRawMapper {

    @Override
    public AuthorRawGetDTO convertEntityToGetDTO(AuthorRaw authorRaw) {
        if ( authorRaw == null ) {
            return null;
        }

        AuthorRawGetDTO authorRawGetDTO = new AuthorRawGetDTO();

        authorRawGetDTO.setDate( authorRaw.getDate() );
        authorRawGetDTO.setId( authorRaw.getId() );
        authorRawGetDTO.setScrapeContent( authorRaw.getScrapeContent() );
        authorRawGetDTO.setUrl( authorRaw.getUrl() );
        authorRawGetDTO.setBaseEntity( authorToAuthorGetDTO( authorRaw.getBaseEntity() ) );

        return authorRawGetDTO;
    }

    @Override
    public AuthorRaw convertPostDTOToEntity(AuthorRawPostDTO postDTO) {
        if ( postDTO == null ) {
            return null;
        }

        AuthorRaw authorRaw = new AuthorRaw();

        authorRaw.setScrapeContent( postDTO.getScrapeContent() );
        authorRaw.setDate( postDTO.getDate() );
        authorRaw.setUrl( postDTO.getUrl() );
        authorRaw.setBaseEntity( authorPostDTOToAuthor( postDTO.getBaseEntity() ) );

        return authorRaw;
    }

    @Override
    public AuthorRaw updateEntityFromPutDTO(AuthorRawPutDTO putDTO, AuthorRaw authorRaw) {
        if ( putDTO == null && authorRaw == null ) {
            return null;
        }

        AuthorRaw authorRaw1 = new AuthorRaw();

        if ( putDTO != null ) {
            authorRaw1.setDate( putDTO.getDate() );
            authorRaw1.setScrapeContent( putDTO.getScrapeContent() );
            authorRaw1.setUrl( putDTO.getUrl() );
            authorRaw1.setBaseEntity( authorPutDTOToAuthor( putDTO.getBaseEntity() ) );
        }

        return authorRaw1;
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

    protected AuthorGetDTO authorToAuthorGetDTO(Author author) {
        if ( author == null ) {
            return null;
        }

        AuthorGetDTO authorGetDTO = new AuthorGetDTO();

        authorGetDTO.setId( author.getId() );
        authorGetDTO.setName( author.getName() );
        authorGetDTO.setAnalytics( authorAnalyticsToAuthorAnalyticsGetDTO( author.getAnalytics() ) );

        return authorGetDTO;
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

    protected Author authorPostDTOToAuthor(AuthorPostDTO authorPostDTO) {
        if ( authorPostDTO == null ) {
            return null;
        }

        Author author = new Author();

        author.setName( authorPostDTO.getName() );
        author.setAnalytics( authorAnalyticsPostDTOToAuthorAnalytics( authorPostDTO.getAnalytics() ) );

        return author;
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

    protected Author authorPutDTOToAuthor(AuthorPutDTO authorPutDTO) {
        if ( authorPutDTO == null ) {
            return null;
        }

        Author author = new Author();

        author.setId( authorPutDTO.getId() );
        author.setName( authorPutDTO.getName() );
        author.setAnalytics( authorAnalyticsPutDTOToAuthorAnalytics( authorPutDTO.getAnalytics() ) );

        return author;
    }
}
