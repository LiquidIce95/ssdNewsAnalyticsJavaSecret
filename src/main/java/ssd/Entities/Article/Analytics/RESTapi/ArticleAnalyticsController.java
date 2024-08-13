package ssd.Entities.Article.Analytics.RESTapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ssd.Entities.Article.Analytics.ArticleAnalytics;
import ssd.Entities.Article.Analytics.ArticleAnalyticsRepository;
import ssd.Entities.Article.Analytics.RESTapi.DTO.ArticleAnalyticsGetDTO;
import ssd.Entities.Article.Analytics.RESTapi.DTO.ArticleAnalyticsPostDTO;
import ssd.Entities.Article.Analytics.RESTapi.DTO.ArticleAnalyticsPutDTO;
import ssd.AbstractClasses.Analytics.RESTapi.AnalyticsController;

@RestController
@RequestMapping("/article-analytics")
public class ArticleAnalyticsController extends AnalyticsController<ArticleAnalytics, ArticleAnalyticsRepository, ArticleAnalyticsGetDTO, ArticleAnalyticsPostDTO, ArticleAnalyticsPutDTO, ArticleAnalyticsMapper> {

    public ArticleAnalyticsController(ArticleAnalyticsRepository repository, ArticleAnalyticsMapper mapper) {
        super(repository, mapper);
    }
}
