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

}
