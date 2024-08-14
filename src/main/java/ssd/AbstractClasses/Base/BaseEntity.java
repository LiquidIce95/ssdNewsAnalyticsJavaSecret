package ssd.AbstractClasses.Base;

import java.io.Serializable;

import javax.persistence.*;

import ssd.AbstractClasses.Analytics.Analytics;

@MappedSuperclass
public abstract class BaseEntity<T extends Analytics> implements Serializable{

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "analytics_id",nullable = false)
    private T analytics;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "entity_id")
    private Long id;

    // Constructor that accepts Class<T> for instantiation
    public BaseEntity(Class<T> analyticsClass) {
      this.name = "defaultName";
      try {
          this.analytics = analyticsClass.getDeclaredConstructor().newInstance();
      } catch (Exception e) {
          throw new RuntimeException("Failed to create instance of " + analyticsClass.getName(), e);
      }
  }

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
