package ssd.Entities.Publisher.Raw.RESTapi;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ssd.Entities.Publisher.Raw.PublisherRaw;
import ssd.Entities.Publisher.Raw.RESTapi.DTO.PublisherRawGetDTO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-13T14:13:04+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 17.0.10 (Debian)"
)
@Component
public class PublisherRawMapperImpl implements PublisherRawMapper {

    @Override
    public PublisherRawGetDTO convertEntityToGetDTO(PublisherRaw publisherRaw) {
        if ( publisherRaw == null ) {
            return null;
        }

        PublisherRawGetDTO publisherRawGetDTO = new PublisherRawGetDTO();

        publisherRawGetDTO.setDate( publisherRaw.getDate() );
        publisherRawGetDTO.setId( publisherRaw.getId() );
        publisherRawGetDTO.setScrapeContent( publisherRaw.getScrapeContent() );
        publisherRawGetDTO.setUrl( publisherRaw.getUrl() );
        publisherRawGetDTO.setBaseEntity( publisherRaw.getBaseEntity() );

        return publisherRawGetDTO;
    }
}
