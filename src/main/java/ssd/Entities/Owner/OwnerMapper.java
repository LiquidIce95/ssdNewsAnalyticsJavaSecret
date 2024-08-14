package ssd.Entities.Owner;

import ssd.AbstractClasses.AbstractMapper;
import ssd.Entities.Owner.Analytics.OwnerAnalytics;
import ssd.Entities.Owner.Analytics.RESTapi.OwnerAnalyticsDTO;
import ssd.Entities.Owner.Base.Owner;
import ssd.Entities.Owner.Base.RESTapi.OwnerDTO;
import ssd.Entities.Owner.Raw.OwnerRaw;
import ssd.Entities.Owner.Raw.RESTapi.OwnerRawDTO;
import org.springframework.stereotype.Component;

@Component
public class OwnerMapper extends AbstractMapper<
        OwnerAnalytics, OwnerAnalyticsDTO,
        Owner, OwnerDTO,
        OwnerRaw, OwnerRawDTO> {

    // Constructor that passes the class types to the superclass constructor
    public OwnerMapper() {
        super(
            OwnerAnalytics.class,
            OwnerAnalyticsDTO.class,
            Owner.class,
            OwnerDTO.class,
            OwnerRaw.class,
            OwnerRawDTO.class
        );
    }

    // No additional logic required, as all mapping functions are inherited
}
