package com.irod.taskshoppingcart.Service;

import com.irod.taskshoppingcart.Model.User;
import com.irod.taskshoppingcart.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public UserService(){

    }
    public User Login(String username, String password) {
        User user =  userRepo.findByUsernameAndPassword(username, password).orElse(new User());
        return user;
    }

    public List<User> findAllUser() {
        return userRepo.findAll();
    }

    public void saveAll(List<User> user) {
        userRepo.saveAll(user);
    }
}

