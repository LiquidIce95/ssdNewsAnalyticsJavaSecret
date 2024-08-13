package ssd.AbstractClasses.Raw.RESTapi;

import ssd.AbstractClasses.Analytics.Analytics;
import ssd.AbstractClasses.Analytics.RESTapi.DTO.AnalyticsGetDTO;
import ssd.AbstractClasses.Analytics.RESTapi.DTO.AnalyticsPostDTO;
import ssd.AbstractClasses.Analytics.RESTapi.DTO.AnalyticsPutDTO;
import ssd.AbstractClasses.Base.BaseEntity;
import ssd.AbstractClasses.Base.RESTapi.DTO.BaseEntityGetDTO;
import ssd.AbstractClasses.Base.RESTapi.DTO.BaseEntityPostDTO;
import ssd.AbstractClasses.Base.RESTapi.DTO.BaseEntityPutDTO;
import ssd.AbstractClasses.Raw.EntityRaw;
import ssd.AbstractClasses.Raw.RESTapi.DTO.EntityRawGetDTO;
import ssd.AbstractClasses.Raw.RESTapi.DTO.EntityRawPostDTO;
import ssd.AbstractClasses.Raw.RESTapi.DTO.EntityRawPutDTO;

public interface EntityRawMapper<E extends EntityRaw<? extends BaseEntity<? extends Analytics>>, G extends EntityRawGetDTO<? extends BaseEntityGetDTO<? extends AnalyticsGetDTO>>, P extends EntityRawPostDTO<? extends BaseEntityPostDTO<? extends AnalyticsPostDTO>>, U extends EntityRawPutDTO<? extends BaseEntityPutDTO<? extends AnalyticsPutDTO>>> {

    G convertEntityToGetDTO(E entity);

    E convertPostDTOToEntity(P postDTO);

    E updateEntityFromPutDTO(U putDTO, E entity);
}
