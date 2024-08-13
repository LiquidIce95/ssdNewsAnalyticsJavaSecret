package ssd.Entities.Publisher.Raw.RESTapi;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import ssd.AbstractClasses.Raw.RESTapi.EntityRawMapper;
import ssd.Entities.Publisher.Raw.PublisherRaw;
import ssd.Entities.Publisher.Raw.RESTapi.DTO.PublisherRawGetDTO;

@Mapper(componentModel = "spring")
public interface PublisherRawMapper extends EntityRawMapper<PublisherRaw, PublisherRawGetDTO> {

    PublisherRawMapper INSTANCE = Mappers.getMapper(PublisherRawMapper.class);

    @Override
    @Mapping(source = "id", target = "id")
    @Mapping(source = "scrapeContent", target = "scrapeContent")
    @Mapping(source = "date", target = "date")
    @Mapping(source = "url", target = "url")
    @Mapping(source = "baseEntity", target = "baseEntity")
    PublisherRawGetDTO convertEntityToGetDTO(PublisherRaw publisherRaw);

    // Additional mappings can be added here if necessary
}
