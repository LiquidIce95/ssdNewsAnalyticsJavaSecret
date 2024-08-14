package ssd.Entities.Author.Raw.RESTapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ssd.Entities.Author.Raw.AuthorRaw;
import ssd.Entities.Author.Raw.AuthorRawRepository;
import ssd.Entities.Author.AuthorMapper;
import ssd.Entities.Author.Base.Author;
import ssd.Entities.Author.Base.RESTapi.AuthorDTO;
import ssd.Entities.Author.Analytics.AuthorAnalytics;
import ssd.Entities.Author.Analytics.RESTapi.AuthorAnalyticsDTO;
import ssd.AbstractClasses.Raw.RESTapi.EntityRawController;

@RestController
@RequestMapping("/author-raws")
public class AuthorRawController extends EntityRawController<AuthorAnalytics, AuthorAnalyticsDTO, Author, AuthorDTO, AuthorRaw, AuthorRawDTO, AuthorRawRepository, AuthorMapper> {

    public AuthorRawController(AuthorRawRepository repository) {
        super(repository, new AuthorMapper());
    }
}
