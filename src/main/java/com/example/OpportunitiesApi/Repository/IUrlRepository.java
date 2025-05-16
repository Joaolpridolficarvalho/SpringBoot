package com.example.OpportunitiesApi.Repository;

import com.example.OpportunitiesApi.Model.Url;
import org.springframework.data.repository.Repository;


@org.springframework.stereotype.Repository
public interface IUrlRepository extends Repository<Url, Integer> {
    Url findByUrl(String url);
    Url findById(int id);
    boolean existsByUrl(String url);
    boolean existsById(int id);
    void save(Url url);
    void delete(Url url);
}
