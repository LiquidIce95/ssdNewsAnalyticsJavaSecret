package ssd.Entities.Topic.Base.RESTapi;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import ssd.Entities.Topic.Base.Topic;
import ssd.Entities.Topic.Base.RESTapi.DTO.TopicGetDTO;
import ssd.Entities.Topic.Base.RESTapi.DTO.TopicPostDTO;
import ssd.Entities.Topic.Base.RESTapi.DTO.TopicPutDTO;
import ssd.AbstractClasses.Base.RESTapi.BaseEntityMapper;

@Mapper(componentModel = "spring")
public interface TopicMapper extends BaseEntityMapper<Topic, TopicGetDTO, TopicPostDTO, TopicPutDTO> {

    TopicMapper INSTANCE = Mappers.getMapper(TopicMapper.class);

    @Override
    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "analytics", target = "analytics")
    TopicGetDTO convertEntityToGetDTO(Topic topic);

    @Override
    @Mapping(target = "id", ignore = true)
    @Mapping(source = "postDTO.name", target = "name")
    @Mapping(source = "postDTO.analytics", target = "analytics")
    Topic convertPostDTOToEntity(TopicPostDTO postDTO);

    @Override
    @Mapping(target = "id", ignore = true)
    @Mapping(source = "putDTO.name", target = "name")
    @Mapping(source = "putDTO.analytics", target = "analytics")
    Topic updateEntityFromPutDTO(TopicPutDTO putDTO, Topic topic);
}
