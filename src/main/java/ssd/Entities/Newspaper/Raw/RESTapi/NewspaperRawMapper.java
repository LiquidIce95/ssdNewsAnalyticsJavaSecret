package ssd.Entities.Newspaper.Raw.RESTapi;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import ssd.AbstractClasses.Raw.RESTapi.EntityRawMapper;
import ssd.Entities.Newspaper.Raw.NewspaperRaw;
import ssd.Entities.Newspaper.Raw.RESTapi.DTO.NewspaperRawGetDTO;

@Mapper(componentModel = "spring")
public interface NewspaperRawMapper extends EntityRawMapper<NewspaperRaw, NewspaperRawGetDTO> {

    NewspaperRawMapper INSTANCE = Mappers.getMapper(NewspaperRawMapper.class);

    @Override
    @Mapping(source = "id", target = "id")
    @Mapping(source = "scrapeContent", target = "scrapeContent")
    @Mapping(source = "date", target = "date")
    @Mapping(source = "url", target = "url")
    @Mapping(source = "baseEntity", target = "baseEntity")
    NewspaperRawGetDTO convertEntityToGetDTO(NewspaperRaw newspaperRaw);

    // Additional mappings can be added here if necessary
}
