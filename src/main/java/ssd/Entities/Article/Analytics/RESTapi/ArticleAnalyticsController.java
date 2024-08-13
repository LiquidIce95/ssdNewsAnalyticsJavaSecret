package ssd.Entities.Article.Analytics.RESTapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ssd.AbstractClasses.Analytics.RESTapi.AnalyticsController;
import ssd.Entities.Article.Analytics.ArticleAnalytics;
import ssd.Entities.Article.Analytics.ArticleAnalyticsRepository;
import ssd.Entities.Article.Analytics.RESTapi.DTO.ArticleAnalyticsGetDTO;

@RestController
@RequestMapping("/article-analytics")
public class ArticleAnalyticsController extends AnalyticsController<ArticleAnalytics, ArticleAnalyticsRepository, ArticleAnalyticsGetDTO,ArticleAnalyticsMapper> {

    public ArticleAnalyticsController(ArticleAnalyticsRepository repository, ArticleAnalyticsMapper mapper) {
        super(repository, mapper);
    }
}
