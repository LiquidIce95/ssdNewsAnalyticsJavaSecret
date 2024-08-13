package ssd.Entities.Newspaper.Raw.RESTapi;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import ssd.Entities.Newspaper.Raw.NewspaperRaw;
import ssd.Entities.Newspaper.Raw.RESTapi.DTO.NewspaperRawGetDTO;
import ssd.Entities.Newspaper.Raw.RESTapi.DTO.NewspaperRawPostDTO;
import ssd.Entities.Newspaper.Raw.RESTapi.DTO.NewspaperRawPutDTO;
import ssd.AbstractClasses.Raw.RESTapi.EntityRawMapper;

@Mapper(componentModel = "spring")
public interface NewspaperRawMapper extends EntityRawMapper<NewspaperRaw, NewspaperRawGetDTO, NewspaperRawPostDTO, NewspaperRawPutDTO> {

    NewspaperRawMapper INSTANCE = Mappers.getMapper(NewspaperRawMapper.class);

    @Override
    @Mapping(source = "id", target = "id")
    @Mapping(source = "scrapeContent", target = "scrapeContent")
    @Mapping(source = "date", target = "date")
    @Mapping(source = "url", target = "url")
    @Mapping(source = "baseEntity", target = "baseEntity")
    NewspaperRawGetDTO convertEntityToGetDTO(NewspaperRaw newspaperRaw);

    @Override
    @Mapping(target = "id", ignore = true)
    NewspaperRaw convertPostDTOToEntity(NewspaperRawPostDTO postDTO);

    @Override
    @Mapping(target = "id", ignore = true)
    @Mapping(source = "putDTO.scrapeContent", target = "scrapeContent")
    @Mapping(source = "putDTO.date", target = "date")
    @Mapping(source = "putDTO.url", target = "url")
    @Mapping(source = "putDTO.baseEntity", target = "baseEntity")
    NewspaperRaw updateEntityFromPutDTO(NewspaperRawPutDTO putDTO, NewspaperRaw newspaperRaw);
}
