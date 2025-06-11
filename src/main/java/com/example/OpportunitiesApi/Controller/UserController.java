package com.example.OpportunitiesApi.Controller;

import com.example.OpportunitiesApi.Service.IUserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

// TODO: Exception handling
@Controller
public class UserController {
    @Autowired
    private IUserManager userService;
    @PostMapping("/Register")
    public void registerUser(String email, String password) {
        if (userService.userExists(email)) {
            throw new IllegalArgumentException("User already exists");
        }
     userService.addUser(email, password);

    }
    @PostMapping("/DeleteUser")
    public void deleteUser(int id) {
        userService.deleteUser(id);
    }
    @PostMapping("/UpdateUser")
    public void updateUser(int id, String email, String password) {
        userService.updateUser(id, email, password);
    }


}
