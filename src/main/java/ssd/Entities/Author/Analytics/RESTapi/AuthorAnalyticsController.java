package ssd.Entities.Author.Analytics.RESTapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ssd.Entities.Author.Analytics.AuthorAnalytics;
import ssd.Entities.Author.Analytics.AuthorAnalyticsRepository;
import ssd.Entities.Author.Analytics.RESTapi.DTO.AuthorAnalyticsGetDTO;
import ssd.Entities.Author.Analytics.RESTapi.DTO.AuthorAnalyticsPostDTO;
import ssd.Entities.Author.Analytics.RESTapi.DTO.AuthorAnalyticsPutDTO;
import ssd.AbstractClasses.Analytics.RESTapi.AnalyticsController;

@RestController
@RequestMapping("/author-analytics")
public class AuthorAnalyticsController extends AnalyticsController<AuthorAnalytics, AuthorAnalyticsRepository, AuthorAnalyticsGetDTO, AuthorAnalyticsPostDTO, AuthorAnalyticsPutDTO, AuthorAnalyticsMapper> {

    public AuthorAnalyticsController(AuthorAnalyticsRepository repository, AuthorAnalyticsMapper mapper) {
        super(repository, mapper);
    }
}
