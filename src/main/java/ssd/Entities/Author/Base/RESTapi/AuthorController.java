package ssd.Entities.Author.Base.RESTapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ssd.Entities.Author.Base.Author;
import ssd.Entities.Author.Base.AuthorRepository;
import ssd.Entities.Author.Raw.AuthorRaw;
import ssd.Entities.Author.Raw.RESTapi.AuthorRawDTO;
import ssd.Entities.Author.AuthorMapper;
import ssd.Entities.Author.Analytics.AuthorAnalytics;
import ssd.Entities.Author.Analytics.RESTapi.AuthorAnalyticsDTO;
import ssd.AbstractClasses.Base.RESTapi.BaseEntityController;

@RestController
@RequestMapping("/authors")
public class AuthorController extends BaseEntityController<AuthorAnalytics, AuthorAnalyticsDTO, Author, AuthorDTO, AuthorRaw, AuthorRawDTO, AuthorRepository, AuthorMapper> {

    public AuthorController(AuthorRepository repository) {
        super(repository, new AuthorMapper());
    }
}
