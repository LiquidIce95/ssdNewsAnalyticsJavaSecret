package ssd.Entities.Topic.Analytics.RESTapi;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import ssd.AbstractClasses.Analytics.RESTapi.AnalyticsMapper;
import ssd.Entities.Topic.Analytics.TopicAnalytics;
import ssd.Entities.Topic.Analytics.RESTapi.DTO.TopicAnalyticsGetDTO;

@Mapper(componentModel = "spring")
public interface TopicAnalyticsMapper extends AnalyticsMapper<TopicAnalytics,TopicAnalyticsGetDTO> {

    TopicAnalyticsMapper INSTANCE = Mappers.getMapper(TopicAnalyticsMapper.class);

    @Override
    @Mapping(source = "id", target = "id")
    @Mapping(source = "bias", target = "bias")
    @Mapping(source = "views", target = "views")
    @Mapping(source = "shares", target = "shares")
    @Mapping(source = "likes", target = "likes")
    @Mapping(source = "engagementRate", target = "engagementRate")
    TopicAnalyticsGetDTO convertEntityToGetDTO(TopicAnalytics topicAnalytics);

    // Additional mappings can be added here if necessary
}
