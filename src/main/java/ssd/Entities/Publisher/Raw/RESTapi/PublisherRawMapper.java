package ssd.Entities.Publisher.Raw.RESTapi;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import ssd.Entities.Publisher.Raw.PublisherRaw;
import ssd.Entities.Publisher.Raw.RESTapi.DTO.PublisherRawGetDTO;
import ssd.Entities.Publisher.Raw.RESTapi.DTO.PublisherRawPostDTO;
import ssd.Entities.Publisher.Raw.RESTapi.DTO.PublisherRawPutDTO;
import ssd.AbstractClasses.Raw.RESTapi.EntityRawMapper;

@Mapper(componentModel = "spring")
public interface PublisherRawMapper extends EntityRawMapper<PublisherRaw, PublisherRawGetDTO, PublisherRawPostDTO, PublisherRawPutDTO> {

    PublisherRawMapper INSTANCE = Mappers.getMapper(PublisherRawMapper.class);

    @Override
    @Mapping(source = "id", target = "id")
    @Mapping(source = "scrapeContent", target = "scrapeContent")
    @Mapping(source = "date", target = "date")
    @Mapping(source = "url", target = "url")
    @Mapping(source = "baseEntity", target = "baseEntity")
    PublisherRawGetDTO convertEntityToGetDTO(PublisherRaw publisherRaw);

    @Override
    @Mapping(target = "id", ignore = true)
    PublisherRaw convertPostDTOToEntity(PublisherRawPostDTO postDTO);

    @Override
    @Mapping(target = "id", ignore = true)
    @Mapping(source = "putDTO.scrapeContent", target = "scrapeContent")
    @Mapping(source = "putDTO.date", target = "date")
    @Mapping(source = "putDTO.url", target = "url")
    @Mapping(source = "putDTO.baseEntity", target = "baseEntity")
    PublisherRaw updateEntityFromPutDTO(PublisherRawPutDTO putDTO, PublisherRaw publisherRaw);
}
