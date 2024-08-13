package ssd.AbstractClasses.Base.RESTapi;

import ssd.AbstractClasses.Analytics.Analytics;
import ssd.AbstractClasses.Analytics.RESTapi.DTO.AnalyticsGetDTO;
import ssd.AbstractClasses.Analytics.RESTapi.DTO.AnalyticsPostDTO;
import ssd.AbstractClasses.Analytics.RESTapi.DTO.AnalyticsPutDTO;
import ssd.AbstractClasses.Base.BaseEntity;
import ssd.AbstractClasses.Base.RESTapi.DTO.BaseEntityGetDTO;
import ssd.AbstractClasses.Base.RESTapi.DTO.BaseEntityPostDTO;
import ssd.AbstractClasses.Base.RESTapi.DTO.BaseEntityPutDTO;

public interface BaseEntityMapper<E extends BaseEntity<? extends Analytics>, G extends BaseEntityGetDTO<? extends AnalyticsGetDTO>, P extends BaseEntityPostDTO<? extends AnalyticsPostDTO>, U extends BaseEntityPutDTO<? extends AnalyticsPutDTO>> {

    G convertEntityToGetDTO(E entity);

    E convertPostDTOToEntity(P postDTO);

    E updateEntityFromPutDTO(U putDTO, E entity);
}
