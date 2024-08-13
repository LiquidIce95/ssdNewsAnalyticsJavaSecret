package ssd.Entities.Topic.Analytics.RESTapi;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import ssd.Entities.Topic.Analytics.TopicAnalytics;
import ssd.Entities.Topic.Analytics.RESTapi.DTO.TopicAnalyticsGetDTO;
import ssd.Entities.Topic.Analytics.RESTapi.DTO.TopicAnalyticsPostDTO;
import ssd.Entities.Topic.Analytics.RESTapi.DTO.TopicAnalyticsPutDTO;
import ssd.AbstractClasses.Analytics.RESTapi.AnalyticsMapper;

@Mapper(componentModel = "spring")
public interface TopicAnalyticsMapper extends AnalyticsMapper<TopicAnalytics, TopicAnalyticsGetDTO, TopicAnalyticsPostDTO, TopicAnalyticsPutDTO> {

    TopicAnalyticsMapper INSTANCE = Mappers.getMapper(TopicAnalyticsMapper.class);

    @Override
    @Mapping(source = "id", target = "id")
    @Mapping(source = "bias", target = "bias")
    @Mapping(source = "views", target = "views")
    @Mapping(source = "shares", target = "shares")
    @Mapping(source = "likes", target = "likes")
    @Mapping(source = "engagementRate", target = "engagementRate")
    TopicAnalyticsGetDTO convertEntityToGetDTO(TopicAnalytics topicAnalytics);

    @Override
    @Mapping(target = "id", ignore = true)
    TopicAnalytics convertPostDTOToEntity(TopicAnalyticsPostDTO postDTO);

    @Override
    @Mapping(target = "id", ignore = true)
    @Mapping(source = "putDTO.bias", target = "bias")
    @Mapping(source = "putDTO.views", target = "views")
    @Mapping(source = "putDTO.shares", target = "shares")
    @Mapping(source = "putDTO.likes", target = "likes")
    @Mapping(source = "putDTO.engagementRate", target = "engagementRate")
    TopicAnalytics updateEntityFromPutDTO(TopicAnalyticsPutDTO putDTO, TopicAnalytics topicAnalytics);
}
