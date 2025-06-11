package com.example.OpportunitiesApi.Service;

import com.example.OpportunitiesApi.Model.Opportunity;
import com.example.OpportunitiesApi.Model.User;

import java.util.List;

public interface IOpportunityManager {
    void addOpportunity(User user, Opportunity opportunity);
    void updateOpportunity(User user, Opportunity opportunity);
    void deleteOpportunity(User user, Opportunity opportunity);

    Opportunity getOpportunityById(User user, Opportunity opportunity);
    List<Opportunity> getOpportunitiesByApplicationDate(User user, String applicationDate);
    List<Opportunity> getOpportunitiesByStatus(User user, String status);
}
