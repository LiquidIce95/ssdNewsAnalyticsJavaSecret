package ssd.Entities.Author.Analytics.RESTapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ssd.AbstractClasses.Analytics.RESTapi.AnalyticsController;
import ssd.Entities.Author.Analytics.AuthorAnalytics;
import ssd.Entities.Author.Analytics.AuthorAnalyticsRepository;
import ssd.Entities.Author.Analytics.RESTapi.DTO.AuthorAnalyticsGetDTO;

@RestController
@RequestMapping("/author-analytics")
public class AuthorAnalyticsController extends AnalyticsController<AuthorAnalytics, AuthorAnalyticsRepository, AuthorAnalyticsGetDTO,AuthorAnalyticsMapper> {

    public AuthorAnalyticsController(AuthorAnalyticsRepository repository, AuthorAnalyticsMapper mapper) {
        super(repository, mapper);
    }
}
