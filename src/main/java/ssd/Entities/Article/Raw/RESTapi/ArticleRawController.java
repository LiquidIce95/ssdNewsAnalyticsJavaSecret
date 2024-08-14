package ssd.Entities.Article.Raw.RESTapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ssd.Entities.Article.Raw.ArticleRaw;
import ssd.Entities.Article.Raw.ArticleRawRepository;
import ssd.Entities.Article.ArticleMapper;
import ssd.Entities.Article.Base.Article;
import ssd.Entities.Article.Base.RESTapi.ArticleDTO;
import ssd.Entities.Article.Analytics.ArticleAnalytics;
import ssd.Entities.Article.Analytics.RESTapi.ArticleAnalyticsDTO;
import ssd.AbstractClasses.Raw.RESTapi.EntityRawController;

@RestController
@RequestMapping("/article-raws")
public class ArticleRawController extends EntityRawController<ArticleAnalytics, ArticleAnalyticsDTO, Article, ArticleDTO, ArticleRaw, ArticleRawDTO, ArticleRawRepository, ArticleMapper> {

    public ArticleRawController(ArticleRawRepository repository) {
        super(repository, new ArticleMapper());
    }
}
