package ssd.Entities.Owner.Analytics.RESTapi;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import ssd.Entities.Owner.Analytics.OwnerAnalytics;
import ssd.Entities.Owner.Analytics.RESTapi.DTO.OwnerAnalyticsGetDTO;
import ssd.Entities.Owner.Analytics.RESTapi.DTO.OwnerAnalyticsPostDTO;
import ssd.Entities.Owner.Analytics.RESTapi.DTO.OwnerAnalyticsPutDTO;
import ssd.AbstractClasses.Analytics.RESTapi.AnalyticsMapper;

@Mapper(componentModel = "spring")
public interface OwnerAnalyticsMapper extends AnalyticsMapper<OwnerAnalytics, OwnerAnalyticsGetDTO, OwnerAnalyticsPostDTO, OwnerAnalyticsPutDTO> {

    OwnerAnalyticsMapper INSTANCE = Mappers.getMapper(OwnerAnalyticsMapper.class);

    @Override
    @Mapping(source = "id", target = "id")
    @Mapping(source = "bias", target = "bias")
    @Mapping(source = "views", target = "views")
    @Mapping(source = "shares", target = "shares")
    @Mapping(source = "likes", target = "likes")
    @Mapping(source = "engagementRate", target = "engagementRate")
    OwnerAnalyticsGetDTO convertEntityToGetDTO(OwnerAnalytics ownerAnalytics);

    @Override
    @Mapping(target = "id", ignore = true)
    OwnerAnalytics convertPostDTOToEntity(OwnerAnalyticsPostDTO postDTO);

    @Override
    @Mapping(target = "id", ignore = true)
    @Mapping(source = "putDTO.bias", target = "bias")
    @Mapping(source = "putDTO.views", target = "views")
    @Mapping(source = "putDTO.shares", target = "shares")
    @Mapping(source = "putDTO.likes", target = "likes")
    @Mapping(source = "putDTO.engagementRate", target = "engagementRate")
    OwnerAnalytics updateEntityFromPutDTO(OwnerAnalyticsPutDTO putDTO, OwnerAnalytics ownerAnalytics);
}
