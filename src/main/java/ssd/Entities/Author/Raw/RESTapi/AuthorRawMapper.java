package ssd.Entities.Author.Raw.RESTapi;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import ssd.Entities.Author.Raw.AuthorRaw;
import ssd.Entities.Author.Raw.RESTapi.DTO.AuthorRawGetDTO;
import ssd.Entities.Author.Raw.RESTapi.DTO.AuthorRawPostDTO;
import ssd.Entities.Author.Raw.RESTapi.DTO.AuthorRawPutDTO;
import ssd.AbstractClasses.Raw.RESTapi.EntityRawMapper;

@Mapper(componentModel = "spring")
public interface AuthorRawMapper extends EntityRawMapper<AuthorRaw, AuthorRawGetDTO, AuthorRawPostDTO, AuthorRawPutDTO> {

    AuthorRawMapper INSTANCE = Mappers.getMapper(AuthorRawMapper.class);

    @Override
    @Mapping(source = "id", target = "id")
    @Mapping(source = "scrapeContent", target = "scrapeContent")
    @Mapping(source = "date", target = "date")
    @Mapping(source = "url", target = "url")
    @Mapping(source = "baseEntity", target = "baseEntity")
    AuthorRawGetDTO convertEntityToGetDTO(AuthorRaw authorRaw);

    @Override
    @Mapping(target = "id", ignore = true)
    AuthorRaw convertPostDTOToEntity(AuthorRawPostDTO postDTO);

    @Override
    @Mapping(target = "id", ignore = true)
    @Mapping(source = "putDTO.scrapeContent", target = "scrapeContent")
    @Mapping(source = "putDTO.date", target = "date")
    @Mapping(source = "putDTO.url", target = "url")
    @Mapping(source = "putDTO.baseEntity", target = "baseEntity")
    AuthorRaw updateEntityFromPutDTO(AuthorRawPutDTO putDTO, AuthorRaw authorRaw);
}
