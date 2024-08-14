package ssd.Entities.Article.Analytics.RESTapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ssd.Entities.Article.Analytics.ArticleAnalytics;
import ssd.Entities.Article.Analytics.ArticleAnalyticsRepository;
import ssd.Entities.Article.ArticleMapper;
import ssd.Entities.Article.Base.Article;
import ssd.Entities.Article.Base.RESTapi.ArticleDTO;
import ssd.Entities.Article.Raw.ArticleRaw;
import ssd.Entities.Article.Raw.RESTapi.ArticleRawDTO;
import ssd.AbstractClasses.Analytics.RESTapi.AnalyticsController;

@RestController
@RequestMapping("/article-analytics")
public class ArticleAnalyticsController extends AnalyticsController<ArticleAnalytics, ArticleAnalyticsDTO, Article, ArticleDTO, ArticleRaw, ArticleRawDTO, ArticleAnalyticsRepository, ArticleMapper> {

    public ArticleAnalyticsController(ArticleAnalyticsRepository repository) {
        super(repository, new ArticleMapper());
    }
}
