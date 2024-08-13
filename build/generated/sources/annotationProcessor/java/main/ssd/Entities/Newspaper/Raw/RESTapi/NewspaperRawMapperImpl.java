package ssd.Entities.Newspaper.Raw.RESTapi;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ssd.Entities.Newspaper.Raw.NewspaperRaw;
import ssd.Entities.Newspaper.Raw.RESTapi.DTO.NewspaperRawGetDTO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-13T13:50:12+0200",
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
        newspaperRawGetDTO.setBaseEntity( newspaperRaw.getBaseEntity() );

        return newspaperRawGetDTO;
    }
}
