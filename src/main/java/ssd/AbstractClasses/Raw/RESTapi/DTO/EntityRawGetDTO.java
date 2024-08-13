package ssd.AbstractClasses.Raw.RESTapi.DTO;

import ssd.AbstractClasses.Base.BaseEntity;
import ssd.AbstractClasses.Base.RESTapi.DTO.BaseEntityGetDTO;
import ssd.AbstractClasses.Analytics.Analytics;
import ssd.AbstractClasses.Analytics.RESTapi.DTO.AnalyticsGetDTO;

import java.util.Date;

public class EntityRawGetDTO<T extends BaseEntityGetDTO<? extends AnalyticsGetDTO>> {

    private Long id;
    private String scrapeContent;
    private Date date;
    private String url;
    private T baseEntity;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getScrapeContent() {
        return scrapeContent;
    }

    public void setScrapeContent(String scrapeContent) {
        this.scrapeContent = scrapeContent;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public T getBaseEntity() {
        return baseEntity;
    }

    public void setBaseEntity(T baseEntity) {
        this.baseEntity = baseEntity;
    }
}
