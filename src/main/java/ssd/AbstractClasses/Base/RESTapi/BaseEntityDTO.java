package ssd.AbstractClasses.Base.RESTapi;

import ssd.AbstractClasses.Analytics.Analytics;
import ssd.AbstractClasses.Analytics.RESTapi.AnalyticsDTO;

public class BaseEntityDTO<T extends AnalyticsDTO> {

    private Long id;
    private String name;
    private T analytics;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
