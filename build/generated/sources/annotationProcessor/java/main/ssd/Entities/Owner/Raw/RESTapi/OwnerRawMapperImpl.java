package ssd.Entities.Owner.Raw.RESTapi;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ssd.Entities.Owner.Raw.OwnerRaw;
import ssd.Entities.Owner.Raw.RESTapi.DTO.OwnerRawGetDTO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-13T14:39:44+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 17.0.10 (Debian)"
)
@Component
public class OwnerRawMapperImpl implements OwnerRawMapper {

    @Override
    public OwnerRawGetDTO convertEntityToGetDTO(OwnerRaw ownerRaw) {
        if ( ownerRaw == null ) {
            return null;
        }

        OwnerRawGetDTO ownerRawGetDTO = new OwnerRawGetDTO();

        ownerRawGetDTO.setDate( ownerRaw.getDate() );
        ownerRawGetDTO.setId( ownerRaw.getId() );
        ownerRawGetDTO.setScrapeContent( ownerRaw.getScrapeContent() );
        ownerRawGetDTO.setUrl( ownerRaw.getUrl() );
        ownerRawGetDTO.setBaseEntity( ownerRaw.getBaseEntity() );

        return ownerRawGetDTO;
    }
}
