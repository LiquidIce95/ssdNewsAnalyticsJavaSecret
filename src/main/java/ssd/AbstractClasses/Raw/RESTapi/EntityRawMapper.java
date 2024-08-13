package ssd.AbstractClasses.Raw.RESTapi;

import ssd.AbstractClasses.Raw.EntityRaw;
import ssd.AbstractClasses.Raw.RESTapi.DTO.EntityRawGetDTO;
import ssd.AbstractClasses.Base.BaseEntity;
import ssd.AbstractClasses.Analytics.Analytics;

public interface EntityRawMapper<E extends EntityRaw<? extends BaseEntity<? extends Analytics>>, D extends EntityRawGetDTO<? extends BaseEntity<? extends Analytics>>> {

    D convertEntityToGetDTO(E entityRaw);

    // Add more mappings as needed
}
