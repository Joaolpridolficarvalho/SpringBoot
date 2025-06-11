package com.example.OpportunitiesApi.Repository;

import com.example.OpportunitiesApi.Model.Opportunity;
import org.springframework.data.repository.Repository;

import java.util.List;
@org.springframework.stereotype.Repository
public interface IOpportunityRepository extends Repository<Opportunity, Integer> {
    Opportunity findById(int id, int userId);
    Opportunity findByName(String title, int userId);
    boolean existsById(int id, int userId);
    boolean existsByName(String title, int userId);
    void save(Opportunity opportunity);
    void delete(Opportunity opportunity);
    void update(Opportunity opportunity);
    List<Opportunity> findByApplicationDate(String applicationDate, int userId);
    List<Opportunity> findByStatus(String status, int userId);
    List<Opportunity> findByUserId(int userId);
}
