package ssd.Entities.Author.Base.RESTapi;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import ssd.Entities.Author.Base.Author;
import ssd.Entities.Author.Base.RESTapi.DTO.AuthorGetDTO;
import ssd.Entities.Author.Base.RESTapi.DTO.AuthorPostDTO;
import ssd.Entities.Author.Base.RESTapi.DTO.AuthorPutDTO;
import ssd.AbstractClasses.Base.RESTapi.BaseEntityMapper;

@Mapper(componentModel = "spring")
public interface AuthorMapper extends BaseEntityMapper<Author, AuthorGetDTO, AuthorPostDTO, AuthorPutDTO> {

    AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

    @Override
    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "analytics", target = "analytics")
    AuthorGetDTO convertEntityToGetDTO(Author author);

    @Override
    @Mapping(target = "id", ignore = true)
    @Mapping(source = "postDTO.name", target = "name")
    @Mapping(source = "postDTO.analytics", target = "analytics")
    Author convertPostDTOToEntity(AuthorPostDTO postDTO);

    @Override
    @Mapping(target = "id", ignore = true)
    @Mapping(source = "putDTO.name", target = "name")
    @Mapping(source = "putDTO.analytics", target = "analytics")
    Author updateEntityFromPutDTO(AuthorPutDTO putDTO, Author author);
}
