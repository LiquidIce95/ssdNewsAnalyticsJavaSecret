package ssd.Entities.Article.Analytics.RESTapi;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import ssd.AbstractClasses.Analytics.RESTapi.AnalyticsMapper;
import ssd.Entities.Article.Analytics.ArticleAnalytics;
import ssd.Entities.Article.Analytics.RESTapi.DTO.ArticleAnalyticsGetDTO;
import ssd.Entities.Article.Base.RESTapi.DTO.ArticleGetDTO;

@Mapper(componentModel = "spring")
public interface ArticleAnalyticsMapper extends AnalyticsMapper<ArticleAnalytics,ArticleAnalyticsGetDTO> {

    ArticleAnalyticsMapper INSTANCE = Mappers.getMapper(ArticleAnalyticsMapper.class);

    @Override
    @Mapping(source = "id", target = "id")
    @Mapping(source = "bias", target = "bias")
    @Mapping(source = "views", target = "views")
    @Mapping(source = "shares", target = "shares")
    @Mapping(source = "likes", target = "likes")
    @Mapping(source = "engagementRate", target = "engagementRate")
    ArticleAnalyticsGetDTO convertEntityToGetDTO(ArticleAnalytics articleAnalytics);

    // Additional mappings can be added here if necessary
}
