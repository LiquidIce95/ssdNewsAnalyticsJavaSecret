package ssd.Entities.Owner.Base.RESTapi;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import ssd.Entities.Owner.Base.Owner;
import ssd.Entities.Owner.Base.RESTapi.DTO.OwnerGetDTO;
import ssd.Entities.Owner.Base.RESTapi.DTO.OwnerPostDTO;
import ssd.Entities.Owner.Base.RESTapi.DTO.OwnerPutDTO;
import ssd.AbstractClasses.Base.RESTapi.BaseEntityMapper;

@Mapper(componentModel = "spring")
public interface OwnerMapper extends BaseEntityMapper<Owner, OwnerGetDTO, OwnerPostDTO, OwnerPutDTO> {

    OwnerMapper INSTANCE = Mappers.getMapper(OwnerMapper.class);

    @Override
    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "analytics", target = "analytics")
    OwnerGetDTO convertEntityToGetDTO(Owner owner);

    @Override
    @Mapping(target = "id", ignore = true)
    @Mapping(source = "postDTO.name", target = "name")
    @Mapping(source = "postDTO.analytics", target = "analytics")
    Owner convertPostDTOToEntity(OwnerPostDTO postDTO);

    @Override
    @Mapping(target = "id", ignore = true)
    @Mapping(source = "putDTO.name", target = "name")
    @Mapping(source = "putDTO.analytics", target = "analytics")
    Owner updateEntityFromPutDTO(OwnerPutDTO putDTO, Owner owner);
}
