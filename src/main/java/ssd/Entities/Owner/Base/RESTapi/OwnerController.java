package ssd.Entities.Owner.Base.RESTapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ssd.Entities.Owner.Base.Owner;
import ssd.Entities.Owner.Base.OwnerRepository;
import ssd.Entities.Owner.Raw.OwnerRaw;
import ssd.Entities.Owner.Raw.RESTapi.OwnerRawDTO;
import ssd.Entities.Owner.OwnerMapper;
import ssd.Entities.Owner.Analytics.OwnerAnalytics;
import ssd.Entities.Owner.Analytics.RESTapi.OwnerAnalyticsDTO;
import ssd.AbstractClasses.Base.RESTapi.BaseEntityController;

@RestController
@RequestMapping("/owners")
public class OwnerController extends BaseEntityController<OwnerAnalytics, OwnerAnalyticsDTO, Owner, OwnerDTO, OwnerRaw, OwnerRawDTO, OwnerRepository, OwnerMapper> {

    public OwnerController(OwnerRepository repository) {
        super(repository, new OwnerMapper());
    }
}
