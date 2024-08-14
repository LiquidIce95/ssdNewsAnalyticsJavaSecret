package ssd.Entities.Author.Analytics.RESTapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ssd.Entities.Author.Analytics.AuthorAnalytics;
import ssd.Entities.Author.Analytics.AuthorAnalyticsRepository;
import ssd.Entities.Author.AuthorMapper;
import ssd.Entities.Author.Base.Author;
import ssd.Entities.Author.Base.RESTapi.AuthorDTO;
import ssd.Entities.Author.Raw.AuthorRaw;
import ssd.Entities.Author.Raw.RESTapi.AuthorRawDTO;
import ssd.AbstractClasses.Analytics.RESTapi.AnalyticsController;

@RestController
@RequestMapping("/author-analytics")
public class AuthorAnalyticsController extends AnalyticsController<AuthorAnalytics, AuthorAnalyticsDTO, Author, AuthorDTO, AuthorRaw, AuthorRawDTO, AuthorAnalyticsRepository, AuthorMapper> {

    public AuthorAnalyticsController(AuthorAnalyticsRepository repository) {
        super(repository, new AuthorMapper());
    }
}
