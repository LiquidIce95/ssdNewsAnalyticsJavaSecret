package ssd.Entities.Newspaper.Analytics.RESTapi;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import ssd.AbstractClasses.Analytics.RESTapi.AnalyticsMapper;
import ssd.Entities.Newspaper.Analytics.NewspaperAnalytics;
import ssd.Entities.Newspaper.Analytics.RESTapi.DTO.NewspaperAnalyticsGetDTO;

@Mapper(componentModel = "spring")
public interface NewspaperAnalyticsMapper extends AnalyticsMapper<NewspaperAnalytics,NewspaperAnalyticsGetDTO> {

    NewspaperAnalyticsMapper INSTANCE = Mappers.getMapper(NewspaperAnalyticsMapper.class);

    @Override
    @Mapping(source = "id", target = "id")
    @Mapping(source = "bias", target = "bias")
    @Mapping(source = "views", target = "views")
    @Mapping(source = "shares", target = "shares")
    @Mapping(source = "likes", target = "likes")
    @Mapping(source = "engagementRate", target = "engagementRate")
    NewspaperAnalyticsGetDTO convertEntityToGetDTO(NewspaperAnalytics newspaperAnalytics);

    // Additional mappings can be added here if necessary
}
