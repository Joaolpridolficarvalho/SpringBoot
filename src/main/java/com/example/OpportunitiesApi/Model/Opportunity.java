package com.example.OpportunitiesApi.Model;
import jakarta.persistence.*;

@Entity
@Table(name = "Opportunity")
public class Opportunity {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Description")
    private String description;
    @Column(name = "UrlId")
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private int urlId;
    @Column(name = "Status")
    private String status;
    @Column(name = "ApplicationDate")
    long applicationDate;
    @Column(name = "FeedbackDate")
    long feedbackDate;
    @Column(name = "UserId")
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private int userId;

    public int getId() {
        return id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUrlId() {
        return urlId;
    }

    public void setUrlId(int urlId) {
        this.urlId = urlId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(long applicationDate) {
        this.applicationDate = applicationDate;
    }

    public long getFeedbackDate() {
        return feedbackDate;
    }

    public void setFeedbackDate(long feedbackDate) {
        this.feedbackDate = feedbackDate;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
