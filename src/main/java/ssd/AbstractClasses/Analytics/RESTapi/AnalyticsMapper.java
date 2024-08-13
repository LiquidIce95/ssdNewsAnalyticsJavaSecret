package ssd.AbstractClasses.Analytics.RESTapi;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import ssd.AbstractClasses.Analytics.Analytics;
import ssd.AbstractClasses.Analytics.RESTapi.DTO.AnalyticsGetDTO;

public interface AnalyticsMapper<F extends Analytics,D extends AnalyticsGetDTO>{

   D convertEntityToGetDTO(F analytics);
}
