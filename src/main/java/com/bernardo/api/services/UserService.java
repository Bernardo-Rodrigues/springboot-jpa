package com.bernardo.api.services;

import com.bernardo.api.entities.User;
import com.bernardo.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(Integer id){
        return userRepository.findById(id).get();
    }
}