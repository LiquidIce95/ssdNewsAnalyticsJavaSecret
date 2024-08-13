package ssd.Entities.Publisher.Base.RESTapi;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import ssd.Entities.Publisher.Base.Publisher;
import ssd.Entities.Publisher.Base.RESTapi.DTO.PublisherGetDTO;
import ssd.Entities.Publisher.Base.RESTapi.DTO.PublisherPostDTO;
import ssd.Entities.Publisher.Base.RESTapi.DTO.PublisherPutDTO;
import ssd.AbstractClasses.Base.RESTapi.BaseEntityMapper;

@Mapper(componentModel = "spring")
public interface PublisherMapper extends BaseEntityMapper<Publisher, PublisherGetDTO, PublisherPostDTO, PublisherPutDTO> {

    PublisherMapper INSTANCE = Mappers.getMapper(PublisherMapper.class);

    @Override
    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "analytics", target = "analytics")
    PublisherGetDTO convertEntityToGetDTO(Publisher publisher);

    @Override
    @Mapping(target = "id", ignore = true)
    @Mapping(source = "postDTO.name", target = "name")
    @Mapping(source = "postDTO.analytics", target = "analytics")
    Publisher convertPostDTOToEntity(PublisherPostDTO postDTO);

    @Override
    @Mapping(target = "id", ignore = true)
    @Mapping(source = "putDTO.name", target = "name")
    @Mapping(source = "putDTO.analytics", target = "analytics")
    Publisher updateEntityFromPutDTO(PublisherPutDTO putDTO, Publisher publisher);
}
