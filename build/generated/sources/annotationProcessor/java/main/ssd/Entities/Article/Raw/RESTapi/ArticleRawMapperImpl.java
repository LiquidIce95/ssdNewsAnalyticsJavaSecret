package ssd.Entities.Article.Raw.RESTapi;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ssd.Entities.Article.Raw.ArticleRaw;
import ssd.Entities.Article.Raw.RESTapi.DTO.ArticleRawGetDTO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-13T14:39:44+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 17.0.10 (Debian)"
)
@Component
public class ArticleRawMapperImpl implements ArticleRawMapper {

    @Override
    public ArticleRawGetDTO convertEntityToGetDTO(ArticleRaw articleRaw) {
        if ( articleRaw == null ) {
            return null;
        }

        ArticleRawGetDTO articleRawGetDTO = new ArticleRawGetDTO();

        articleRawGetDTO.setDate( articleRaw.getDate() );
        articleRawGetDTO.setId( articleRaw.getId() );
        articleRawGetDTO.setScrapeContent( articleRaw.getScrapeContent() );
        articleRawGetDTO.setUrl( articleRaw.getUrl() );
        articleRawGetDTO.setBaseEntity( articleRaw.getBaseEntity() );

        return articleRawGetDTO;
    }
}
