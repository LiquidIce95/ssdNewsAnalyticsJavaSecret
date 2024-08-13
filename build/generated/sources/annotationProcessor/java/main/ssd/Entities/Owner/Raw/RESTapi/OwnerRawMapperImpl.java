package ssd.Entities.Owner.Raw.RESTapi;

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
import ssd.Entities.Owner.Raw.OwnerRaw;
import ssd.Entities.Owner.Raw.RESTapi.DTO.OwnerRawGetDTO;
import ssd.Entities.Owner.Raw.RESTapi.DTO.OwnerRawPostDTO;
import ssd.Entities.Owner.Raw.RESTapi.DTO.OwnerRawPutDTO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-13T17:29:08+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 17.0.10 (Debian)"
)
@Component
public class OwnerRawMapperImpl implements OwnerRawMapper {

    @Override
    public OwnerRawGetDTO convertEntityToGetDTO(OwnerRaw ownerRaw) {
        if ( ownerRaw == null ) {
            return null;
        }

        OwnerRawGetDTO ownerRawGetDTO = new OwnerRawGetDTO();

        ownerRawGetDTO.setDate( ownerRaw.getDate() );
        ownerRawGetDTO.setId( ownerRaw.getId() );
        ownerRawGetDTO.setScrapeContent( ownerRaw.getScrapeContent() );
        ownerRawGetDTO.setUrl( ownerRaw.getUrl() );
        ownerRawGetDTO.setBaseEntity( ownerToOwnerGetDTO( ownerRaw.getBaseEntity() ) );

        return ownerRawGetDTO;
    }

    @Override
    public OwnerRaw convertPostDTOToEntity(OwnerRawPostDTO postDTO) {
        if ( postDTO == null ) {
            return null;
        }

        OwnerRaw ownerRaw = new OwnerRaw();

        ownerRaw.setScrapeContent( postDTO.getScrapeContent() );
        ownerRaw.setDate( postDTO.getDate() );
        ownerRaw.setUrl( postDTO.getUrl() );
        ownerRaw.setBaseEntity( ownerPostDTOToOwner( postDTO.getBaseEntity() ) );

        return ownerRaw;
    }

    @Override
    public OwnerRaw updateEntityFromPutDTO(OwnerRawPutDTO putDTO, OwnerRaw ownerRaw) {
        if ( putDTO == null && ownerRaw == null ) {
            return null;
        }

        OwnerRaw ownerRaw1 = new OwnerRaw();

        if ( putDTO != null ) {
            ownerRaw1.setDate( putDTO.getDate() );
            ownerRaw1.setScrapeContent( putDTO.getScrapeContent() );
            ownerRaw1.setUrl( putDTO.getUrl() );
            ownerRaw1.setBaseEntity( ownerPutDTOToOwner( putDTO.getBaseEntity() ) );
        }

        return ownerRaw1;
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

    protected OwnerGetDTO ownerToOwnerGetDTO(Owner owner) {
        if ( owner == null ) {
            return null;
        }

        OwnerGetDTO ownerGetDTO = new OwnerGetDTO();

        ownerGetDTO.setId( owner.getId() );
        ownerGetDTO.setName( owner.getName() );
        ownerGetDTO.setAnalytics( ownerAnalyticsToOwnerAnalyticsGetDTO( owner.getAnalytics() ) );

        return ownerGetDTO;
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

    protected Owner ownerPostDTOToOwner(OwnerPostDTO ownerPostDTO) {
        if ( ownerPostDTO == null ) {
            return null;
        }

        Owner owner = new Owner();

        owner.setName( ownerPostDTO.getName() );
        owner.setAnalytics( ownerAnalyticsPostDTOToOwnerAnalytics( ownerPostDTO.getAnalytics() ) );

        return owner;
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

    protected Owner ownerPutDTOToOwner(OwnerPutDTO ownerPutDTO) {
        if ( ownerPutDTO == null ) {
            return null;
        }

        Owner owner = new Owner();

        owner.setId( ownerPutDTO.getId() );
        owner.setName( ownerPutDTO.getName() );
        owner.setAnalytics( ownerAnalyticsPutDTOToOwnerAnalytics( ownerPutDTO.getAnalytics() ) );

        return owner;
    }
}
