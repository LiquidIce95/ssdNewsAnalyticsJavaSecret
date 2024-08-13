package ssd.AbstractClasses.Base.RESTapi.DTO;

import ssd.AbstractClasses.Analytics.RESTapi.DTO.AnalyticsPostDTO;

public class BaseEntityPostDTO<T extends AnalyticsPostDTO> {
    private String name;
    private T analytics;

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getAnalytics() {
        return analytics;
    }

    public void setAnalytics(T analytics) {
        this.analytics = analytics;
    }
}
