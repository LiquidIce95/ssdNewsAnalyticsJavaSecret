package ssd.AbstractClasses.Raw.RESTapi;

import ssd.AbstractClasses.Base.BaseEntity;
import ssd.AbstractClasses.Base.RESTapi.BaseEntityDTO;
import ssd.AbstractClasses.Analytics.Analytics;
import ssd.AbstractClasses.Analytics.RESTapi.AnalyticsDTO;

import java.util.Date;

public class EntityRawDTO<T extends BaseEntityDTO<? extends AnalyticsDTO>> {

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
