package ssd.AbstractClasses.Base.RESTapi;

import ssd.AbstractClasses.Base.BaseEntity;
import ssd.AbstractClasses.Base.RESTapi.DTO.BaseEntityGetDTO;
import ssd.AbstractClasses.Analytics.Analytics;

public interface BaseEntityMapper<E extends BaseEntity<? extends Analytics>, D extends BaseEntityGetDTO> {

    D convertEntityToGetDTO(E entity);

}
