package com.example.OpportunitiesApi.Repository;

import com.example.OpportunitiesApi.Model.Url;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface IUrlRepository extends JpaRepository<Url, Integer> {
    Url findByUrl(String url);
    boolean existsByUrl(String url);
}