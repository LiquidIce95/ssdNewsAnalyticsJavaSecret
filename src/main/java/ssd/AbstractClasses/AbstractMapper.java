package ssd.AbstractClasses;

import ssd.AbstractClasses.Analytics.Analytics;
import ssd.AbstractClasses.Analytics.RESTapi.AnalyticsDTO;
import ssd.AbstractClasses.Base.BaseEntity;
import ssd.AbstractClasses.Base.RESTapi.BaseEntityDTO;
import ssd.AbstractClasses.Raw.EntityRaw;
import ssd.AbstractClasses.Raw.RESTapi.EntityRawDTO;

public abstract class AbstractMapper<
        A extends Analytics,
        AD extends AnalyticsDTO,
        B extends BaseEntity<A>,
        BD extends BaseEntityDTO<AD>,
        R extends EntityRaw<B>,
        RD extends EntityRawDTO<BD>> {

    // Class references for generic instantiation
    protected final Class<A> analyticsClass;
    protected final Class<AD> analyticsDTOClass;
    protected final Class<B> baseEntityClass;
    protected final Class<BD> baseEntityDTOClass;
    protected final Class<R> entityRawClass;
    protected final Class<RD> entityRawDTOClass;

    // Constructor
    protected AbstractMapper(Class<A> analyticsClass, Class<AD> analyticsDTOClass,
                            Class<B> baseEntityClass, Class<BD> baseEntityDTOClass,
                            Class<R> entityRawClass, Class<RD> entityRawDTOClass) {
        this.analyticsClass = analyticsClass;
        this.analyticsDTOClass = analyticsDTOClass;
        this.baseEntityClass = baseEntityClass;
        this.baseEntityDTOClass = baseEntityDTOClass;
        this.entityRawClass = entityRawClass;
        this.entityRawDTOClass = entityRawDTOClass;
    }

    // Instantiate DTOs
    protected AD createAnalyticsDTOInstance() {
        try {
            return analyticsDTOClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Failed to create instance of " + analyticsDTOClass.getName(), e);
        }
    }

    protected BD createBaseEntityDTOInstance() {
        try {
            return baseEntityDTOClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Failed to create instance of " + baseEntityDTOClass.getName(), e);
        }
    }

    protected RD createEntityRawDTOInstance() {
        try {
            return entityRawDTOClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Failed to create instance of " + entityRawDTOClass.getName(), e);
        }
    }

    // Instantiate Entities
    protected A createAnalyticsInstance() {
        try {
            return analyticsClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Failed to create instance of " + analyticsClass.getName(), e);
        }
    }

    protected B createBaseEntityInstance() {
        try {
            return baseEntityClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Failed to create instance of " + baseEntityClass.getName(), e);
        }
    }

    protected R createEntityRawInstance() {
        try {
            return entityRawClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Failed to create instance of " + entityRawClass.getName(), e);
        }
    }

    // Mapping Methods for Analytics
    public AD convertAnalyticsToDTO(A analytics) {
        AD dto = createAnalyticsDTOInstance();
        dto.setId(analytics.getId());
        dto.setBias(analytics.getBias());
        dto.setViews(analytics.getViews());
        dto.setShares(analytics.getShares());
        dto.setLikes(analytics.getLikes());
        dto.setEngagementRate(analytics.getEngagementRate());
        return dto;
    }

    public A convertDTOToAnalytics(AD dto) {
        A analytics = createAnalyticsInstance();
        analytics.setBias(dto.getBias());
        analytics.setViews(dto.getViews());
        analytics.setShares(dto.getShares());
        analytics.setLikes(dto.getLikes());
        analytics.setEngagementRate(dto.getEngagementRate());
        return analytics;
    }

    public A updateAnalyticsFromDTO(AD dto, A analytics) {
        if (dto.getBias() != null) {
            analytics.setBias(dto.getBias());
        }
        if (dto.getViews() != 0) {
            analytics.setViews(dto.getViews());
        }
        if (dto.getShares() != 0) {
            analytics.setShares(dto.getShares());
        }
        if (dto.getLikes() != 0) {
            analytics.setLikes(dto.getLikes());
        }
        if (dto.getEngagementRate() != 0.0) {
            analytics.setEngagementRate(dto.getEngagementRate());
        }
        return analytics;
    }

    // Mapping Methods for BaseEntity
    public BD convertBaseEntityToDTO(B baseEntity) {
        BD dto = createBaseEntityDTOInstance();
        dto.setId(baseEntity.getId());
        dto.setName(baseEntity.getName());
        dto.setAnalytics(convertAnalyticsToDTO(baseEntity.getAnalytics()));
        return dto;
    }

    public B convertDTOToBaseEntity(BD dto) {
        B baseEntity = createBaseEntityInstance();
        baseEntity.setName(dto.getName());
        baseEntity.setAnalytics(convertDTOToAnalytics(dto.getAnalytics()));
        return baseEntity;
    }

    public B updateBaseEntityFromDTO(BD dto, B baseEntity) {
        if (dto.getName() != null) {
            baseEntity.setName(dto.getName());
        }
        if (dto.getAnalytics() != null) {
            baseEntity.setAnalytics(convertDTOToAnalytics(dto.getAnalytics()));
        }
        return baseEntity;
    }

    // Mapping Methods for EntityRaw
    public RD convertEntityRawToDTO(R entityRaw) {
        RD dto = createEntityRawDTOInstance();
        dto.setId(entityRaw.getId());
        dto.setScrapeContent(entityRaw.getScrapeContent());
        dto.setDate(entityRaw.getDate());
        dto.setUrl(entityRaw.getUrl());
        dto.setBaseEntity(convertBaseEntityToDTO(entityRaw.getBaseEntity()));
        return dto;
    }

    public R convertDTOToEntityRaw(RD dto) {
        R entityRaw = createEntityRawInstance();
        entityRaw.setScrapeContent(dto.getScrapeContent());
        entityRaw.setDate(dto.getDate());
        entityRaw.setUrl(dto.getUrl());
        entityRaw.setBaseEntity(convertDTOToBaseEntity(dto.getBaseEntity()));
        return entityRaw;
    }

    public R updateEntityRawFromDTO(RD dto, R entityRaw) {
        if (dto.getScrapeContent() != null) {
            entityRaw.setScrapeContent(dto.getScrapeContent());
        }
        if (dto.getDate() != null) {
            entityRaw.setDate(dto.getDate());
        }
        if (dto.getUrl() != null) {
            entityRaw.setUrl(dto.getUrl());
        }
        if (dto.getBaseEntity() != null) {
            entityRaw.setBaseEntity(convertDTOToBaseEntity(dto.getBaseEntity()));
        }
        return entityRaw;
    }
}
