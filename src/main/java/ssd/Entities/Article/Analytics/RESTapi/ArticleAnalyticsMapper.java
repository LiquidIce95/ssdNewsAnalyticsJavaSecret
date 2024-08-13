package ssd.Entities.Article.Analytics.RESTapi;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import ssd.Entities.Article.Analytics.ArticleAnalytics;
import ssd.Entities.Article.Analytics.RESTapi.DTO.ArticleAnalyticsGetDTO;
import ssd.Entities.Article.Analytics.RESTapi.DTO.ArticleAnalyticsPostDTO;
import ssd.Entities.Article.Analytics.RESTapi.DTO.ArticleAnalyticsPutDTO;
import ssd.AbstractClasses.Analytics.RESTapi.AnalyticsMapper;

@Mapper(componentModel = "spring")
public interface ArticleAnalyticsMapper extends AnalyticsMapper<ArticleAnalytics, ArticleAnalyticsGetDTO, ArticleAnalyticsPostDTO, ArticleAnalyticsPutDTO> {

    ArticleAnalyticsMapper INSTANCE = Mappers.getMapper(ArticleAnalyticsMapper.class);

    @Override
    @Mapping(source = "id", target = "id")
    @Mapping(source = "bias", target = "bias")
    @Mapping(source = "views", target = "views")
    @Mapping(source = "shares", target = "shares")
    @Mapping(source = "likes", target = "likes")
    @Mapping(source = "engagementRate", target = "engagementRate")
    ArticleAnalyticsGetDTO convertEntityToGetDTO(ArticleAnalytics articleAnalytics);

    @Override
    @Mapping(target = "id", ignore = true)
    ArticleAnalytics convertPostDTOToEntity(ArticleAnalyticsPostDTO postDTO);

    @Override
    @Mapping(target = "id", ignore = true)
    @Mapping(source = "putDTO.bias", target = "bias")
    @Mapping(source = "putDTO.views", target = "views")
    @Mapping(source = "putDTO.shares", target = "shares")
    @Mapping(source = "putDTO.likes", target = "likes")
    @Mapping(source = "putDTO.engagementRate", target = "engagementRate")
    ArticleAnalytics updateEntityFromPutDTO(ArticleAnalyticsPutDTO putDTO, ArticleAnalytics articleAnalytics);
}
