package ssd.Entities.Owner.Analytics.RESTapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ssd.Entities.Owner.Analytics.OwnerAnalytics;
import ssd.Entities.Owner.Analytics.OwnerAnalyticsRepository;
import ssd.Entities.Owner.Analytics.RESTapi.DTO.OwnerAnalyticsGetDTO;
import ssd.Entities.Owner.Analytics.RESTapi.DTO.OwnerAnalyticsPostDTO;
import ssd.Entities.Owner.Analytics.RESTapi.DTO.OwnerAnalyticsPutDTO;
import ssd.AbstractClasses.Analytics.RESTapi.AnalyticsController;

@RestController
@RequestMapping("/owner-analytics")
public class OwnerAnalyticsController extends AnalyticsController<OwnerAnalytics, OwnerAnalyticsRepository, OwnerAnalyticsGetDTO, OwnerAnalyticsPostDTO, OwnerAnalyticsPutDTO, OwnerAnalyticsMapper> {

    public OwnerAnalyticsController(OwnerAnalyticsRepository repository, OwnerAnalyticsMapper mapper) {
        super(repository, mapper);
    }
}
