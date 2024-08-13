package ssd.Entities.Author.Analytics.RESTapi;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import ssd.AbstractClasses.Analytics.RESTapi.AnalyticsMapper;
import ssd.Entities.Author.Analytics.AuthorAnalytics;
import ssd.Entities.Author.Analytics.RESTapi.DTO.AuthorAnalyticsGetDTO;

@Mapper(componentModel = "spring")
public interface AuthorAnalyticsMapper extends AnalyticsMapper<AuthorAnalytics,AuthorAnalyticsGetDTO> {

    AuthorAnalyticsMapper INSTANCE = Mappers.getMapper(AuthorAnalyticsMapper.class);

    @Override
    @Mapping(source = "id", target = "id")
    @Mapping(source = "bias", target = "bias")
    @Mapping(source = "views", target = "views")
    @Mapping(source = "shares", target = "shares")
    @Mapping(source = "likes", target = "likes")
    @Mapping(source = "engagementRate", target = "engagementRate")
    AuthorAnalyticsGetDTO convertEntityToGetDTO(AuthorAnalytics authorAnalytics);

    // Additional mappings can be added here if necessary
}
