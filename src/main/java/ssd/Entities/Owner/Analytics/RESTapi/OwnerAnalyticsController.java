package ssd.Entities.Owner.Analytics.RESTapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ssd.Entities.Owner.Analytics.OwnerAnalytics;
import ssd.Entities.Owner.Analytics.OwnerAnalyticsRepository;
import ssd.Entities.Owner.OwnerMapper;
import ssd.Entities.Owner.Base.Owner;
import ssd.Entities.Owner.Base.RESTapi.OwnerDTO;
import ssd.Entities.Owner.Raw.OwnerRaw;
import ssd.Entities.Owner.Raw.RESTapi.OwnerRawDTO;
import ssd.AbstractClasses.Analytics.RESTapi.AnalyticsController;

@RestController
@RequestMapping("/owner-analytics")
public class OwnerAnalyticsController extends AnalyticsController<OwnerAnalytics, OwnerAnalyticsDTO, Owner, OwnerDTO, OwnerRaw, OwnerRawDTO, OwnerAnalyticsRepository, OwnerMapper> {

    public OwnerAnalyticsController(OwnerAnalyticsRepository repository) {
        super(repository, new OwnerMapper());
    }
}
