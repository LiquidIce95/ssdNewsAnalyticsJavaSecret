package ssd.Entities.Article.Raw.RESTapi;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import ssd.Entities.Article.Raw.ArticleRaw;
import ssd.Entities.Article.Raw.RESTapi.DTO.ArticleRawGetDTO;
import ssd.Entities.Article.Raw.RESTapi.DTO.ArticleRawPostDTO;
import ssd.Entities.Article.Raw.RESTapi.DTO.ArticleRawPutDTO;
import ssd.AbstractClasses.Raw.RESTapi.EntityRawMapper;

@Mapper(componentModel = "spring")
public interface ArticleRawMapper extends EntityRawMapper<ArticleRaw, ArticleRawGetDTO, ArticleRawPostDTO, ArticleRawPutDTO> {

    ArticleRawMapper INSTANCE = Mappers.getMapper(ArticleRawMapper.class);

    @Override
    @Mapping(source = "id", target = "id")
    @Mapping(source = "scrapeContent", target = "scrapeContent")
    @Mapping(source = "date", target = "date")
    @Mapping(source = "url", target = "url")
    @Mapping(source = "baseEntity", target = "baseEntity")
    ArticleRawGetDTO convertEntityToGetDTO(ArticleRaw articleRaw);

    @Override
    @Mapping(target = "id", ignore = true)
    ArticleRaw convertPostDTOToEntity(ArticleRawPostDTO postDTO);

    @Override
    @Mapping(target = "id", ignore = true)
    @Mapping(source = "putDTO.scrapeContent", target = "scrapeContent")
    @Mapping(source = "putDTO.date", target = "date")
    @Mapping(source = "putDTO.url", target = "url")
    @Mapping(source = "putDTO.baseEntity", target = "baseEntity")
    ArticleRaw updateEntityFromPutDTO(ArticleRawPutDTO putDTO, ArticleRaw articleRaw);
}
