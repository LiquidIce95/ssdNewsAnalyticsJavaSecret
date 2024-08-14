package ssd.Entities.Author;

import ssd.AbstractClasses.AbstractMapper;
import ssd.Entities.Author.Analytics.AuthorAnalytics;
import ssd.Entities.Author.Analytics.RESTapi.AuthorAnalyticsDTO;
import ssd.Entities.Author.Base.Author;
import ssd.Entities.Author.Base.RESTapi.AuthorDTO;
import ssd.Entities.Author.Raw.AuthorRaw;
import ssd.Entities.Author.Raw.RESTapi.AuthorRawDTO;
import org.springframework.stereotype.Component;

@Component
public class AuthorMapper extends AbstractMapper<
        AuthorAnalytics, AuthorAnalyticsDTO,
        Author, AuthorDTO,
        AuthorRaw, AuthorRawDTO> {

    // Constructor that passes the class types to the superclass constructor
    public AuthorMapper() {
        super(
            AuthorAnalytics.class,
            AuthorAnalyticsDTO.class,
            Author.class,
            AuthorDTO.class,
            AuthorRaw.class,
            AuthorRawDTO.class
        );
    }

    // No additional logic required, as all mapping functions are inherited
}
