package ssd.Entities.Owner.Raw.RESTapi;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import ssd.Entities.Owner.Raw.OwnerRaw;
import ssd.Entities.Owner.Raw.RESTapi.DTO.OwnerRawGetDTO;
import ssd.Entities.Owner.Raw.RESTapi.DTO.OwnerRawPostDTO;
import ssd.Entities.Owner.Raw.RESTapi.DTO.OwnerRawPutDTO;
import ssd.AbstractClasses.Raw.RESTapi.EntityRawMapper;

@Mapper(componentModel = "spring")
public interface OwnerRawMapper extends EntityRawMapper<OwnerRaw, OwnerRawGetDTO, OwnerRawPostDTO, OwnerRawPutDTO> {

    OwnerRawMapper INSTANCE = Mappers.getMapper(OwnerRawMapper.class);

    @Override
    @Mapping(source = "id", target = "id")
    @Mapping(source = "scrapeContent", target = "scrapeContent")
    @Mapping(source = "date", target = "date")
    @Mapping(source = "url", target = "url")
    @Mapping(source = "baseEntity", target = "baseEntity")
    OwnerRawGetDTO convertEntityToGetDTO(OwnerRaw ownerRaw);

    @Override
    @Mapping(target = "id", ignore = true)
    OwnerRaw convertPostDTOToEntity(OwnerRawPostDTO postDTO);

    @Override
    @Mapping(target = "id", ignore = true)
    @Mapping(source = "putDTO.scrapeContent", target = "scrapeContent")
    @Mapping(source = "putDTO.date", target = "date")
    @Mapping(source = "putDTO.url", target = "url")
    @Mapping(source = "putDTO.baseEntity", target = "baseEntity")
    OwnerRaw updateEntityFromPutDTO(OwnerRawPutDTO putDTO, OwnerRaw ownerRaw);
}
