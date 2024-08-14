package ssd.Entities.Article;

import ssd.AbstractClasses.AbstractMapper;
import ssd.Entities.Article.Analytics.ArticleAnalytics;
import ssd.Entities.Article.Analytics.RESTapi.ArticleAnalyticsDTO;
import ssd.Entities.Article.Base.Article;
import ssd.Entities.Article.Base.RESTapi.ArticleDTO;
import ssd.Entities.Article.Raw.ArticleRaw;
import ssd.Entities.Article.Raw.RESTapi.ArticleRawDTO;
import org.springframework.stereotype.Component;

@Component
public class ArticleMapper extends AbstractMapper<
        ArticleAnalytics, ArticleAnalyticsDTO,
        Article, ArticleDTO,
        ArticleRaw, ArticleRawDTO> {

    // Constructor that passes the class types to the superclass constructor
    public ArticleMapper() {
        super(
            ArticleAnalytics.class,
            ArticleAnalyticsDTO.class,
            Article.class,
            ArticleDTO.class,
            ArticleRaw.class,
            ArticleRawDTO.class
        );
    }

    // No additional logic required, as all mapping functions are inherited
}
