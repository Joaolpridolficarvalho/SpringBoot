package com.example.OpportunitiesApi.Repository;

import com.example.OpportunitiesApi.Model.Opportunity;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface IOpportunityRepository extends Repository<Opportunity, Integer> {
    Opportunity findById(int id, int userId);
    Opportunity findByTitle(String title, int userId);
    boolean existsById(int id, int userId);
    boolean existsByTitle(String title, int userId);
    void save(Opportunity opportunity, int id);
    void delete(Opportunity opportunity, int id);
    List<Opportunity> findByApplicationDate(String applicationDate, int userId);
    List<Opportunity> findByStatus(String status, int userId);
}
