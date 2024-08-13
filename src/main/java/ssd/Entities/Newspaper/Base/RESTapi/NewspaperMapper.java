package ssd.Entities.Newspaper.Base.RESTapi;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import ssd.Entities.Newspaper.Base.Newspaper;
import ssd.Entities.Newspaper.Base.RESTapi.DTO.NewspaperGetDTO;
import ssd.Entities.Newspaper.Base.RESTapi.DTO.NewspaperPostDTO;
import ssd.Entities.Newspaper.Base.RESTapi.DTO.NewspaperPutDTO;
import ssd.AbstractClasses.Base.RESTapi.BaseEntityMapper;

@Mapper(componentModel = "spring")
public interface NewspaperMapper extends BaseEntityMapper<Newspaper, NewspaperGetDTO, NewspaperPostDTO, NewspaperPutDTO> {

    NewspaperMapper INSTANCE = Mappers.getMapper(NewspaperMapper.class);

    @Override
    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "analytics", target = "analytics")
    NewspaperGetDTO convertEntityToGetDTO(Newspaper newspaper);

    @Override
    @Mapping(target = "id", ignore = true)
    @Mapping(source = "postDTO.name", target = "name")
    @Mapping(source = "postDTO.analytics", target = "analytics")
    Newspaper convertPostDTOToEntity(NewspaperPostDTO postDTO);

    @Override
    @Mapping(target = "id", ignore = true)
    @Mapping(source = "putDTO.name", target = "name")
    @Mapping(source = "putDTO.analytics", target = "analytics")
    Newspaper updateEntityFromPutDTO(NewspaperPutDTO putDTO, Newspaper newspaper);
}
