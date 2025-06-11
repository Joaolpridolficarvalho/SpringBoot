package com.example.OpportunitiesApi.Service;

import com.example.OpportunitiesApi.Model.Opportunity;
import com.example.OpportunitiesApi.Model.User;
import com.example.OpportunitiesApi.Repository.IOpportunityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OpportunityService implements IOpportunityManager {
    private final IOpportunityRepository opportunityRepository;

    public OpportunityService(IOpportunityRepository opportunityRepository) {
        this.opportunityRepository = opportunityRepository;
    }

    @Override
    public void addOpportunity(User user, Opportunity opportunity) {
        if (opportunityRepository.existsByName(opportunity.getName(), user.getId())) {
            throw new IllegalArgumentException("Opportunity already exists");
        }
        opportunity.setUserId(user.getId());
        opportunityRepository.save(opportunity);
    }

    @Override
    public void updateOpportunity(User user, Opportunity opportunity) {
        if (!opportunityRepository.existsById(opportunity.getId(), user.getId())) {
            throw new IllegalArgumentException("Opportunity not found");
        }
        opportunity.setUserId(user.getId());
        opportunityRepository.update(opportunity);

    }

    @Override
    public void deleteOpportunity(User user, Opportunity opportunity) {
        if (!opportunityRepository.existsById(opportunity.getId(), user.getId())) {
            throw new IllegalArgumentException("Opportunity not found");
        }
        opportunityRepository.delete(opportunity);

    }

    @Override
    public Opportunity getOpportunityById(User user, Opportunity opportunity) {
        Opportunity foundOpportunity = opportunityRepository.findById(opportunity.getId(), user.getId());
        if (foundOpportunity == null) {
            throw new IllegalArgumentException("Opportunity not found");
        }
        return foundOpportunity;
    }

    @Override
    public List<Opportunity> getOpportunitiesByApplicationDate(User user, String applicationDate) {
        return opportunityRepository.findByApplicationDate(applicationDate, user.getId());
    }

    @Override
    public List<Opportunity> getOpportunitiesByStatus(User user, String status) {
        return opportunityRepository.findByStatus(status, user.getId());
    }
}