package ssd.Entities.Publisher.Analytics.RESTapi;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import ssd.Entities.Publisher.Analytics.PublisherAnalytics;
import ssd.Entities.Publisher.Analytics.RESTapi.DTO.PublisherAnalyticsGetDTO;
import ssd.Entities.Publisher.Analytics.RESTapi.DTO.PublisherAnalyticsPostDTO;
import ssd.Entities.Publisher.Analytics.RESTapi.DTO.PublisherAnalyticsPutDTO;
import ssd.AbstractClasses.Analytics.RESTapi.AnalyticsMapper;

@Mapper(componentModel = "spring")
public interface PublisherAnalyticsMapper extends AnalyticsMapper<PublisherAnalytics, PublisherAnalyticsGetDTO, PublisherAnalyticsPostDTO, PublisherAnalyticsPutDTO> {

    PublisherAnalyticsMapper INSTANCE = Mappers.getMapper(PublisherAnalyticsMapper.class);

    @Override
    @Mapping(source = "id", target = "id")
    @Mapping(source = "bias", target = "bias")
    @Mapping(source = "views", target = "views")
    @Mapping(source = "shares", target = "shares")
    @Mapping(source = "likes", target = "likes")
    @Mapping(source = "engagementRate", target = "engagementRate")
    PublisherAnalyticsGetDTO convertEntityToGetDTO(PublisherAnalytics publisherAnalytics);

    @Override
    @Mapping(target = "id", ignore = true)
    PublisherAnalytics convertPostDTOToEntity(PublisherAnalyticsPostDTO postDTO);

    @Override
    @Mapping(target = "id", ignore = true)
    @Mapping(source = "putDTO.bias", target = "bias")
    @Mapping(source = "putDTO.views", target = "views")
    @Mapping(source = "putDTO.shares", target = "shares")
    @Mapping(source = "putDTO.likes", target = "likes")
    @Mapping(source = "putDTO.engagementRate", target = "engagementRate")
    PublisherAnalytics updateEntityFromPutDTO(PublisherAnalyticsPutDTO putDTO, PublisherAnalytics publisherAnalytics);
}
