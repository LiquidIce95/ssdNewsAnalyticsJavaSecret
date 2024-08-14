package ssd.Entities.Owner.Raw.RESTapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ssd.Entities.Owner.Raw.OwnerRaw;
import ssd.Entities.Owner.Raw.OwnerRawRepository;
import ssd.Entities.Owner.OwnerMapper;
import ssd.Entities.Owner.Base.Owner;
import ssd.Entities.Owner.Base.RESTapi.OwnerDTO;
import ssd.Entities.Owner.Analytics.OwnerAnalytics;
import ssd.Entities.Owner.Analytics.RESTapi.OwnerAnalyticsDTO;
import ssd.AbstractClasses.Raw.RESTapi.EntityRawController;

@RestController
@RequestMapping("/owner-raws")
public class OwnerRawController extends EntityRawController<OwnerAnalytics, OwnerAnalyticsDTO, Owner, OwnerDTO, OwnerRaw, OwnerRawDTO, OwnerRawRepository, OwnerMapper> {

    public OwnerRawController(OwnerRawRepository repository) {
        super(repository, new OwnerMapper());
    }
}
