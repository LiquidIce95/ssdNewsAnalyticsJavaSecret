package ssd.Entities.Owner.Analytics.RESTapi;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ssd.Entities.Owner.Analytics.OwnerAnalytics;
import ssd.Entities.Owner.Analytics.RESTapi.DTO.OwnerAnalyticsGetDTO;
import ssd.Entities.Owner.Analytics.RESTapi.DTO.OwnerAnalyticsPostDTO;
import ssd.Entities.Owner.Analytics.RESTapi.DTO.OwnerAnalyticsPutDTO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-13T17:29:08+0200",
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

    @Override
    public OwnerAnalytics convertPostDTOToEntity(OwnerAnalyticsPostDTO postDTO) {
        if ( postDTO == null ) {
            return null;
        }

        OwnerAnalytics ownerAnalytics = new OwnerAnalytics();

        ownerAnalytics.setBias( postDTO.getBias() );
        ownerAnalytics.setViews( postDTO.getViews() );
        ownerAnalytics.setShares( postDTO.getShares() );
        ownerAnalytics.setLikes( postDTO.getLikes() );
        ownerAnalytics.setEngagementRate( postDTO.getEngagementRate() );

        return ownerAnalytics;
    }

    @Override
    public OwnerAnalytics updateEntityFromPutDTO(OwnerAnalyticsPutDTO putDTO, OwnerAnalytics ownerAnalytics) {
        if ( putDTO == null && ownerAnalytics == null ) {
            return null;
        }

        OwnerAnalytics ownerAnalytics1 = new OwnerAnalytics();

        if ( putDTO != null ) {
            ownerAnalytics1.setShares( putDTO.getShares() );
            ownerAnalytics1.setEngagementRate( putDTO.getEngagementRate() );
            ownerAnalytics1.setBias( putDTO.getBias() );
            ownerAnalytics1.setViews( putDTO.getViews() );
            ownerAnalytics1.setLikes( putDTO.getLikes() );
        }

        return ownerAnalytics1;
    }
}
