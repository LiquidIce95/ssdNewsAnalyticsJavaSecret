package ssd.Entities.Author.Raw.RESTapi;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import ssd.AbstractClasses.Raw.RESTapi.EntityRawMapper;
import ssd.Entities.Author.Raw.AuthorRaw;
import ssd.Entities.Author.Raw.RESTapi.DTO.AuthorRawGetDTO;

@Mapper(componentModel = "spring")
public interface AuthorRawMapper extends EntityRawMapper<AuthorRaw, AuthorRawGetDTO> {

    AuthorRawMapper INSTANCE = Mappers.getMapper(AuthorRawMapper.class);

    @Override
    @Mapping(source = "id", target = "id")
    @Mapping(source = "scrapeContent", target = "scrapeContent")
    @Mapping(source = "date", target = "date")
    @Mapping(source = "url", target = "url")
    @Mapping(source = "baseEntity", target = "baseEntity")
    AuthorRawGetDTO convertEntityToGetDTO(AuthorRaw authorRaw);

    // Additional mappings can be added here if necessary
}
