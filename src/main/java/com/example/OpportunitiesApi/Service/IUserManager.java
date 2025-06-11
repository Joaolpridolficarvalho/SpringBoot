package com.example.OpportunitiesApi.Service;

public interface IUserManager {
    void addUser(String email, String password);
    void updateUser(int id, String email, String password);
    void deleteUser(int id);
    boolean userExists(String email);
}
