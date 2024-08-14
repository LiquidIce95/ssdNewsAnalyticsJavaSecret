package ssd.Entities.Newspaper.Analytics.RESTapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ssd.Entities.Newspaper.Analytics.NewspaperAnalytics;
import ssd.Entities.Newspaper.Analytics.NewspaperAnalyticsRepository;
import ssd.Entities.Newspaper.NewspaperMapper;
import ssd.Entities.Newspaper.Base.Newspaper;
import ssd.Entities.Newspaper.Base.RESTapi.NewspaperDTO;
import ssd.Entities.Newspaper.Raw.NewspaperRaw;
import ssd.Entities.Newspaper.Raw.RESTapi.NewspaperRawDTO;
import ssd.AbstractClasses.Analytics.RESTapi.AnalyticsController;

@RestController
@RequestMapping("/newspaper-analytics")
public class NewspaperAnalyticsController extends AnalyticsController<NewspaperAnalytics, NewspaperAnalyticsDTO, Newspaper, NewspaperDTO, NewspaperRaw, NewspaperRawDTO, NewspaperAnalyticsRepository, NewspaperMapper> {

    public NewspaperAnalyticsController(NewspaperAnalyticsRepository repository) {
        super(repository, new NewspaperMapper());
    }
}
