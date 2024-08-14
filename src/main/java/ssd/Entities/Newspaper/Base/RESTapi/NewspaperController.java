package ssd.Entities.Newspaper.Base.RESTapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ssd.Entities.Newspaper.Base.Newspaper;
import ssd.Entities.Newspaper.Base.NewspaperRepository;
import ssd.Entities.Newspaper.Raw.NewspaperRaw;
import ssd.Entities.Newspaper.Raw.RESTapi.NewspaperRawDTO;
import ssd.Entities.Newspaper.NewspaperMapper;
import ssd.Entities.Newspaper.Analytics.NewspaperAnalytics;
import ssd.Entities.Newspaper.Analytics.RESTapi.NewspaperAnalyticsDTO;
import ssd.AbstractClasses.Base.RESTapi.BaseEntityController;

@RestController
@RequestMapping("/newspapers")
public class NewspaperController extends BaseEntityController<NewspaperAnalytics, NewspaperAnalyticsDTO, Newspaper, NewspaperDTO, NewspaperRaw, NewspaperRawDTO, NewspaperRepository, NewspaperMapper> {

    public NewspaperController(NewspaperRepository repository) {
        super(repository, new NewspaperMapper());
    }
}
