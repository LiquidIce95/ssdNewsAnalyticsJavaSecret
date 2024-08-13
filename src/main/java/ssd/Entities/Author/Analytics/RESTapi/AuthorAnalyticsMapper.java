package ssd.Entities.Author.Analytics.RESTapi;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import ssd.Entities.Author.Analytics.AuthorAnalytics;
import ssd.Entities.Author.Analytics.RESTapi.DTO.AuthorAnalyticsGetDTO;
import ssd.Entities.Author.Analytics.RESTapi.DTO.AuthorAnalyticsPostDTO;
import ssd.Entities.Author.Analytics.RESTapi.DTO.AuthorAnalyticsPutDTO;
import ssd.AbstractClasses.Analytics.RESTapi.AnalyticsMapper;

@Mapper(componentModel = "spring")
public interface AuthorAnalyticsMapper extends AnalyticsMapper<AuthorAnalytics, AuthorAnalyticsGetDTO, AuthorAnalyticsPostDTO, AuthorAnalyticsPutDTO> {

    AuthorAnalyticsMapper INSTANCE = Mappers.getMapper(AuthorAnalyticsMapper.class);

    @Override
    @Mapping(source = "id", target = "id")
    @Mapping(source = "bias", target = "bias")
    @Mapping(source = "views", target = "views")
    @Mapping(source = "shares", target = "shares")
    @Mapping(source = "likes", target = "likes")
    @Mapping(source = "engagementRate", target = "engagementRate")
    AuthorAnalyticsGetDTO convertEntityToGetDTO(AuthorAnalytics authorAnalytics);

    @Override
    @Mapping(target = "id", ignore = true)
    AuthorAnalytics convertPostDTOToEntity(AuthorAnalyticsPostDTO postDTO);

    @Override
    @Mapping(target = "id", ignore = true)
    @Mapping(source = "putDTO.bias", target = "bias")
    @Mapping(source = "putDTO.views", target = "views")
    @Mapping(source = "putDTO.shares", target = "shares")
    @Mapping(source = "putDTO.likes", target = "likes")
    @Mapping(source = "putDTO.engagementRate", target = "engagementRate")
    AuthorAnalytics updateEntityFromPutDTO(AuthorAnalyticsPutDTO putDTO, AuthorAnalytics authorAnalytics);
}
