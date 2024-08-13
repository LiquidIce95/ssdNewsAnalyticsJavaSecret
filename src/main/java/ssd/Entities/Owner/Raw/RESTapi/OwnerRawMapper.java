package ssd.Entities.Owner.Raw.RESTapi;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import ssd.AbstractClasses.Raw.RESTapi.EntityRawMapper;
import ssd.Entities.Owner.Raw.OwnerRaw;
import ssd.Entities.Owner.Raw.RESTapi.DTO.OwnerRawGetDTO;

@Mapper(componentModel = "spring")
public interface OwnerRawMapper extends EntityRawMapper<OwnerRaw, OwnerRawGetDTO> {

    OwnerRawMapper INSTANCE = Mappers.getMapper(OwnerRawMapper.class);

    @Override
    @Mapping(source = "id", target = "id")
    @Mapping(source = "scrapeContent", target = "scrapeContent")
    @Mapping(source = "date", target = "date")
    @Mapping(source = "url", target = "url")
    @Mapping(source = "baseEntity", target = "baseEntity")
    OwnerRawGetDTO convertEntityToGetDTO(OwnerRaw ownerRaw);

    // Additional mappings can be added here if necessary
}
