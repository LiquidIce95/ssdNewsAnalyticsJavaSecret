package ssd.AbstractClasses.Raw.RESTapi.DTO;

import ssd.AbstractClasses.Analytics.RESTapi.DTO.AnalyticsPostDTO;
import ssd.AbstractClasses.Base.RESTapi.DTO.BaseEntityPostDTO;

import java.util.Date;

public class EntityRawPostDTO<T extends BaseEntityPostDTO<? extends AnalyticsPostDTO>> {
    private String scrapeContent;
    private Date date;
    private String url;
    private T baseEntity;

    // Getters and Setters

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
