package ssd.AbstractClasses.Analytics.RESTapi;

import org.mapstruct.Mapper;
import ssd.AbstractClasses.Analytics.Analytics;
import ssd.AbstractClasses.Analytics.RESTapi.DTO.AnalyticsGetDTO;
import ssd.AbstractClasses.Analytics.RESTapi.DTO.AnalyticsPostDTO;
import ssd.AbstractClasses.Analytics.RESTapi.DTO.AnalyticsPutDTO;


public interface AnalyticsMapper<E extends Analytics, G extends AnalyticsGetDTO, P extends AnalyticsPostDTO, U extends AnalyticsPutDTO> {

    
    G convertEntityToGetDTO(E entity);

    E convertPostDTOToEntity(P postDTO);

    E updateEntityFromPutDTO(U putDTO, E entity);
}
