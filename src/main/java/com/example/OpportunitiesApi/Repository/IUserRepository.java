package com.example.OpportunitiesApi.Repository;

import com.example.OpportunitiesApi.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String email);
    User findByEmailAndPassword(String email, String password);
    boolean existsByEmail(String email);
    boolean existsByEmailAndPassword(String email, String password);



}
