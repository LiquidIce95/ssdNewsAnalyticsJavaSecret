package ssd.Entities.Owner.Analytics.RESTapi;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ssd.Entities.Owner.Analytics.OwnerAnalytics;
import ssd.Entities.Owner.Analytics.RESTapi.DTO.OwnerAnalyticsGetDTO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-13T14:13:04+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 17.0.10 (Debian)"
)
@Component
public class OwnerAnalyticsMapperImpl implements OwnerAnalyticsMapper {

    @Override
    public OwnerAnalyticsGetDTO convertEntityToGetDTO(OwnerAnalytics ownerAnalytics) {
        if ( ownerAnalytics == null ) {
            return null;
        }

        OwnerAnalyticsGetDTO ownerAnalyticsGetDTO = new OwnerAnalyticsGetDTO();

        ownerAnalyticsGetDTO.setShares( ownerAnalytics.getShares() );
        ownerAnalyticsGetDTO.setEngagementRate( ownerAnalytics.getEngagementRate() );
        ownerAnalyticsGetDTO.setBias( ownerAnalytics.getBias() );
        ownerAnalyticsGetDTO.setId( ownerAnalytics.getId() );
        ownerAnalyticsGetDTO.setViews( ownerAnalytics.getViews() );
        ownerAnalyticsGetDTO.setLikes( ownerAnalytics.getLikes() );

        return ownerAnalyticsGetDTO;
    }
}
