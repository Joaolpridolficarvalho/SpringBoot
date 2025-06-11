package com.example.OpportunitiesApi.Controller;

import com.example.OpportunitiesApi.Model.Opportunity;
import com.example.OpportunitiesApi.Model.User;
import com.example.OpportunitiesApi.Service.IOpportunityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

// TODO: Exception handling
@Controller
public class OpportunityController {
    @Autowired
    private IOpportunityManager opportunityService;

    @PostMapping("/AddOpportunity")
    public void addOpportunity(User user, Opportunity opportunity) {
        opportunityService.addOpportunity(user, opportunity);
    }

    @PostMapping("/DeleteOpportunity")
    public void deleteOpportunity(User user, Opportunity opportunity) {
        opportunityService.deleteOpportunity(user, opportunity);
    }

    @PostMapping("/UpdateOpportunity")
    public void updateOpportunity(User user, Opportunity opportunity) {
        opportunityService.updateOpportunity(user, opportunity);
    }
}



