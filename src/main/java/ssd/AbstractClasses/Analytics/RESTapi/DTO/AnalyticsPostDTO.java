package ssd.AbstractClasses.Analytics.RESTapi.DTO;

public class AnalyticsPostDTO {
    private String bias;
    private int views;
    private int shares;
    private int likes;
    private double engagementRate;

    // Getters and Setters

    public String getBias() {
        return bias;
    }

    public void setBias(String bias) {
        this.bias = bias;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getShares() {
        return shares;
    }

    public void setShares(int shares) {
        this.shares = shares;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public double getEngagementRate() {
        return engagementRate;
    }

    public void setEngagementRate(double engagementRate) {
        this.engagementRate = engagementRate;
    }
}
