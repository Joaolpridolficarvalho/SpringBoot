package com.example.OpportunitiesApi.Service;

import com.example.OpportunitiesApi.Model.User;
import com.example.OpportunitiesApi.Repository.IUserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserManager {

    private final IUserRepository userRepository;

    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void addUser(String email, String password) {
        if (userExists(email)) {
            throw new IllegalArgumentException("User already exists");
        }
        User user = new User();
        userRepository.save(user);
    }

    @Override
    public void updateUser(int id, String email, String password) {
        User user = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("User not found"));
        user.setEmail(email);
        user.setPassword(password);
        userRepository.save(user);
    }

    @Override
    public void deleteUser(int id) {
        User user = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("User not found"));
        userRepository.delete(user);
    }

    @Override
    public boolean userExists(String email) {
        return userRepository.existsByEmail(email);
    }


}
