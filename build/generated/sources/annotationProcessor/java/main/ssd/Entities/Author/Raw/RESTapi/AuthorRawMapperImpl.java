package ssd.Entities.Author.Raw.RESTapi;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ssd.Entities.Author.Raw.AuthorRaw;
import ssd.Entities.Author.Raw.RESTapi.DTO.AuthorRawGetDTO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-13T13:50:12+0200",
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
        authorRawGetDTO.setBaseEntity( authorRaw.getBaseEntity() );

        return authorRawGetDTO;
    }
}
