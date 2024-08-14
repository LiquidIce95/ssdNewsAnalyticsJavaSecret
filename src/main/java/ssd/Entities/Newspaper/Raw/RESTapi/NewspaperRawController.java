package ssd.Entities.Newspaper.Raw.RESTapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ssd.Entities.Newspaper.Raw.NewspaperRaw;
import ssd.Entities.Newspaper.Raw.NewspaperRawRepository;
import ssd.Entities.Newspaper.NewspaperMapper;
import ssd.Entities.Newspaper.Base.Newspaper;
import ssd.Entities.Newspaper.Base.RESTapi.NewspaperDTO;
import ssd.Entities.Newspaper.Analytics.NewspaperAnalytics;
import ssd.Entities.Newspaper.Analytics.RESTapi.NewspaperAnalyticsDTO;
import ssd.AbstractClasses.Raw.RESTapi.EntityRawController;

@RestController
@RequestMapping("/newspaper-raws")
public class NewspaperRawController extends EntityRawController<NewspaperAnalytics, NewspaperAnalyticsDTO, Newspaper, NewspaperDTO, NewspaperRaw, NewspaperRawDTO, NewspaperRawRepository, NewspaperMapper> {

    public NewspaperRawController(NewspaperRawRepository repository) {
        super(repository, new NewspaperMapper());
    }
}
