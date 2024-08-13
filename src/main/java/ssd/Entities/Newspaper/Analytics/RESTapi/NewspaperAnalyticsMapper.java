package ssd.Entities.Newspaper.Analytics.RESTapi;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import ssd.Entities.Newspaper.Analytics.NewspaperAnalytics;
import ssd.Entities.Newspaper.Analytics.RESTapi.DTO.NewspaperAnalyticsGetDTO;
import ssd.Entities.Newspaper.Analytics.RESTapi.DTO.NewspaperAnalyticsPostDTO;
import ssd.Entities.Newspaper.Analytics.RESTapi.DTO.NewspaperAnalyticsPutDTO;
import ssd.AbstractClasses.Analytics.RESTapi.AnalyticsMapper;

@Mapper(componentModel = "spring")
public interface NewspaperAnalyticsMapper extends AnalyticsMapper<NewspaperAnalytics, NewspaperAnalyticsGetDTO, NewspaperAnalyticsPostDTO, NewspaperAnalyticsPutDTO> {

    NewspaperAnalyticsMapper INSTANCE = Mappers.getMapper(NewspaperAnalyticsMapper.class);

    @Override
    @Mapping(source = "id", target = "id")
    @Mapping(source = "bias", target = "bias")
    @Mapping(source = "views", target = "views")
    @Mapping(source = "shares", target = "shares")
    @Mapping(source = "likes", target = "likes")
    @Mapping(source = "engagementRate", target = "engagementRate")
    NewspaperAnalyticsGetDTO convertEntityToGetDTO(NewspaperAnalytics newspaperAnalytics);

    @Override
    @Mapping(target = "id", ignore = true)
    NewspaperAnalytics convertPostDTOToEntity(NewspaperAnalyticsPostDTO postDTO);

    @Override
    @Mapping(target = "id", ignore = true)
    @Mapping(source = "putDTO.bias", target = "bias")
    @Mapping(source = "putDTO.views", target = "views")
    @Mapping(source = "putDTO.shares", target = "shares")
    @Mapping(source = "putDTO.likes", target = "likes")
    @Mapping(source = "putDTO.engagementRate", target = "engagementRate")
    NewspaperAnalytics updateEntityFromPutDTO(NewspaperAnalyticsPutDTO putDTO, NewspaperAnalytics newspaperAnalytics);
}
