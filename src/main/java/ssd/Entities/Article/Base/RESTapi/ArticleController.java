package ssd.Entities.Article.Base.RESTapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ssd.Entities.Article.Base.Article;
import ssd.Entities.Article.Base.ArticleRepository;
import ssd.Entities.Article.Raw.ArticleRaw;
import ssd.Entities.Article.Raw.RESTapi.ArticleRawDTO;
import ssd.Entities.Article.ArticleMapper;
import ssd.Entities.Article.Analytics.ArticleAnalytics;
import ssd.Entities.Article.Analytics.RESTapi.ArticleAnalyticsDTO;
import ssd.AbstractClasses.Base.RESTapi.BaseEntityController;

@RestController
@RequestMapping("/articles")
public class ArticleController extends BaseEntityController<ArticleAnalytics, ArticleAnalyticsDTO, Article, ArticleDTO, ArticleRaw, ArticleRawDTO, ArticleRepository, ArticleMapper> {

    public ArticleController(ArticleRepository repository) {
        super(repository, new ArticleMapper());
    }
}
