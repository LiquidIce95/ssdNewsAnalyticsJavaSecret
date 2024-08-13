package ssd.Entities.Owner.Base.RESTapi;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ssd.Entities.Owner.Analytics.OwnerAnalytics;
import ssd.Entities.Owner.Analytics.RESTapi.DTO.OwnerAnalyticsGetDTO;
import ssd.Entities.Owner.Analytics.RESTapi.DTO.OwnerAnalyticsPostDTO;
import ssd.Entities.Owner.Analytics.RESTapi.DTO.OwnerAnalyticsPutDTO;
import ssd.Entities.Owner.Base.Owner;
import ssd.Entities.Owner.Base.RESTapi.DTO.OwnerGetDTO;
import ssd.Entities.Owner.Base.RESTapi.DTO.OwnerPostDTO;
import ssd.Entities.Owner.Base.RESTapi.DTO.OwnerPutDTO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-13T17:29:08+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 17.0.10 (Debian)"
)
@Component
public class OwnerMapperImpl implements OwnerMapper {

    @Override
    public OwnerGetDTO convertEntityToGetDTO(Owner owner) {
        if ( owner == null ) {
            return null;
        }

        OwnerGetDTO ownerGetDTO = new OwnerGetDTO();

        ownerGetDTO.setAnalytics( ownerAnalyticsToOwnerAnalyticsGetDTO( owner.getAnalytics() ) );
        ownerGetDTO.setName( owner.getName() );
        ownerGetDTO.setId( owner.getId() );

        return ownerGetDTO;
    }

    @Override
    public Owner convertPostDTOToEntity(OwnerPostDTO postDTO) {
        if ( postDTO == null ) {
            return null;
        }

        Owner owner = new Owner();

        owner.setAnalytics( ownerAnalyticsPostDTOToOwnerAnalytics( postDTO.getAnalytics() ) );
        owner.setName( postDTO.getName() );

        return owner;
    }

    @Override
    public Owner updateEntityFromPutDTO(OwnerPutDTO putDTO, Owner owner) {
        if ( putDTO == null && owner == null ) {
            return null;
        }

        Owner owner1 = new Owner();

        if ( putDTO != null ) {
            owner1.setAnalytics( ownerAnalyticsPutDTOToOwnerAnalytics( putDTO.getAnalytics() ) );
            owner1.setName( putDTO.getName() );
        }

        return owner1;
    }

    protected OwnerAnalyticsGetDTO ownerAnalyticsToOwnerAnalyticsGetDTO(OwnerAnalytics ownerAnalytics) {
        if ( ownerAnalytics == null ) {
            return null;
        }

        OwnerAnalyticsGetDTO ownerAnalyticsGetDTO = new OwnerAnalyticsGetDTO();

        ownerAnalyticsGetDTO.setId( ownerAnalytics.getId() );
        ownerAnalyticsGetDTO.setBias( ownerAnalytics.getBias() );
        ownerAnalyticsGetDTO.setViews( ownerAnalytics.getViews() );
        ownerAnalyticsGetDTO.setShares( ownerAnalytics.getShares() );
        ownerAnalyticsGetDTO.setLikes( ownerAnalytics.getLikes() );
        ownerAnalyticsGetDTO.setEngagementRate( ownerAnalytics.getEngagementRate() );

        return ownerAnalyticsGetDTO;
    }

    protected OwnerAnalytics ownerAnalyticsPostDTOToOwnerAnalytics(OwnerAnalyticsPostDTO ownerAnalyticsPostDTO) {
        if ( ownerAnalyticsPostDTO == null ) {
            return null;
        }

        OwnerAnalytics ownerAnalytics = new OwnerAnalytics();

        ownerAnalytics.setBias( ownerAnalyticsPostDTO.getBias() );
        ownerAnalytics.setViews( ownerAnalyticsPostDTO.getViews() );
        ownerAnalytics.setShares( ownerAnalyticsPostDTO.getShares() );
        ownerAnalytics.setLikes( ownerAnalyticsPostDTO.getLikes() );
        ownerAnalytics.setEngagementRate( ownerAnalyticsPostDTO.getEngagementRate() );

        return ownerAnalytics;
    }

    protected OwnerAnalytics ownerAnalyticsPutDTOToOwnerAnalytics(OwnerAnalyticsPutDTO ownerAnalyticsPutDTO) {
        if ( ownerAnalyticsPutDTO == null ) {
            return null;
        }

        OwnerAnalytics ownerAnalytics = new OwnerAnalytics();

        ownerAnalytics.setBias( ownerAnalyticsPutDTO.getBias() );
        ownerAnalytics.setViews( ownerAnalyticsPutDTO.getViews() );
        ownerAnalytics.setShares( ownerAnalyticsPutDTO.getShares() );
        ownerAnalytics.setLikes( ownerAnalyticsPutDTO.getLikes() );
        ownerAnalytics.setEngagementRate( ownerAnalyticsPutDTO.getEngagementRate() );
        ownerAnalytics.setId( ownerAnalyticsPutDTO.getId() );

        return ownerAnalytics;
    }
}
