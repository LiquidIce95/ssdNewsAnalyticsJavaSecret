package ssd.Entities.Article.Base.RESTapi;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import ssd.Entities.Article.Base.Article;
import ssd.Entities.Article.Base.RESTapi.DTO.ArticleGetDTO;
import ssd.Entities.Article.Base.RESTapi.DTO.ArticlePostDTO;
import ssd.Entities.Article.Base.RESTapi.DTO.ArticlePutDTO;
import ssd.AbstractClasses.Base.RESTapi.BaseEntityMapper;

@Mapper(componentModel = "spring")
public interface ArticleMapper extends BaseEntityMapper<Article, ArticleGetDTO, ArticlePostDTO, ArticlePutDTO> {

    ArticleMapper INSTANCE = Mappers.getMapper(ArticleMapper.class);

    @Override
    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "analytics", target = "analytics")
    @Mapping(source = "author", target = "author")
    @Mapping(source = "publisher", target = "publisher")
    @Mapping(source = "topic", target = "topic")
    @Mapping(source = "owner", target = "owner")
    @Mapping(source = "newspaper", target = "newspaper")
    @Mapping(source = "content", target = "content")
    ArticleGetDTO convertEntityToGetDTO(Article article);

    @Override
    @Mapping(target = "id", ignore = true)
    @Mapping(source = "postDTO.name", target = "name")
    @Mapping(source = "postDTO.analytics", target = "analytics")
    @Mapping(source = "postDTO.author", target = "author")
    @Mapping(source = "postDTO.publisher", target = "publisher")
    @Mapping(source = "postDTO.topic", target = "topic")
    @Mapping(source = "postDTO.owner", target = "owner")
    @Mapping(source = "postDTO.newspaper", target = "newspaper")
    @Mapping(source = "postDTO.content", target = "content")
    Article convertPostDTOToEntity(ArticlePostDTO postDTO);

    @Override
    @Mapping(target = "id", ignore = true)
    @Mapping(source = "putDTO.name", target = "name")
    @Mapping(source = "putDTO.analytics", target = "analytics")
    @Mapping(source = "putDTO.author", target = "author")
    @Mapping(source = "putDTO.publisher", target = "publisher")
    @Mapping(source = "putDTO.topic", target = "topic")
    @Mapping(source = "putDTO.owner", target = "owner")
    @Mapping(source = "putDTO.newspaper", target = "newspaper")
    @Mapping(source = "putDTO.content", target = "content")
    Article updateEntityFromPutDTO(ArticlePutDTO putDTO, Article article);
}
