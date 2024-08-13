package ssd.Entities.Owner.Analytics.RESTapi;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import ssd.AbstractClasses.Analytics.RESTapi.AnalyticsMapper;
import ssd.Entities.Owner.Analytics.OwnerAnalytics;
import ssd.Entities.Owner.Analytics.RESTapi.DTO.OwnerAnalyticsGetDTO;

@Mapper(componentModel = "spring")
public interface OwnerAnalyticsMapper extends AnalyticsMapper<OwnerAnalytics,OwnerAnalyticsGetDTO> {

    OwnerAnalyticsMapper INSTANCE = Mappers.getMapper(OwnerAnalyticsMapper.class);

    @Override
    @Mapping(source = "id", target = "id")
    @Mapping(source = "bias", target = "bias")
    @Mapping(source = "views", target = "views")
    @Mapping(source = "shares", target = "shares")
    @Mapping(source = "likes", target = "likes")
    @Mapping(source = "engagementRate", target = "engagementRate")
    OwnerAnalyticsGetDTO convertEntityToGetDTO(OwnerAnalytics ownerAnalytics);

    // Additional mappings can be added here if necessary
}
