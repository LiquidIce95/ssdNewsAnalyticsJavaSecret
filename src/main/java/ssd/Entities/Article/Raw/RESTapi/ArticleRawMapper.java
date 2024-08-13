package ssd.Entities.Article.Raw.RESTapi;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import ssd.AbstractClasses.Raw.RESTapi.EntityRawMapper;
import ssd.Entities.Article.Raw.ArticleRaw;
import ssd.Entities.Article.Raw.RESTapi.DTO.ArticleRawGetDTO;

@Mapper(componentModel = "spring")
public interface ArticleRawMapper extends EntityRawMapper<ArticleRaw, ArticleRawGetDTO> {

    ArticleRawMapper INSTANCE = Mappers.getMapper(ArticleRawMapper.class);

    @Override
    @Mapping(source = "id", target = "id")
    @Mapping(source = "scrapeContent", target = "scrapeContent")
    @Mapping(source = "date", target = "date")
    @Mapping(source = "url", target = "url")
    @Mapping(source = "baseEntity", target = "baseEntity")
    ArticleRawGetDTO convertEntityToGetDTO(ArticleRaw articleRaw);

    // Additional mappings can be added here if necessary
}
