package ssd.Entities.Publisher.Analytics.RESTapi;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import ssd.AbstractClasses.Analytics.RESTapi.AnalyticsMapper;
import ssd.Entities.Publisher.Analytics.PublisherAnalytics;
import ssd.Entities.Publisher.Analytics.RESTapi.DTO.PublisherAnalyticsGetDTO;

@Mapper(componentModel = "spring")
public interface PublisherAnalyticsMapper extends AnalyticsMapper<PublisherAnalytics,PublisherAnalyticsGetDTO> {

    PublisherAnalyticsMapper INSTANCE = Mappers.getMapper(PublisherAnalyticsMapper.class);

    @Override
    @Mapping(source = "id", target = "id")
    @Mapping(source = "bias", target = "bias")
    @Mapping(source = "views", target = "views")
    @Mapping(source = "shares", target = "shares")
    @Mapping(source = "likes", target = "likes")
    @Mapping(source = "engagementRate", target = "engagementRate")
    PublisherAnalyticsGetDTO convertEntityToGetDTO(PublisherAnalytics publisherAnalytics);

    // Additional mappings can be added here if necessary
}
