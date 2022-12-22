package com.bernardo.api.services;

import com.bernardo.api.entities.User;
import com.bernardo.api.exceptions.ResourceNotFoundException;
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
        return userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert(User user){
        return userRepository.save(user);
    }

    public void delete(Integer id){
        userRepository.deleteById(id);
    }

    public User update(Integer id, User user){
        User entity = userRepository.getReferenceById(id);
        updateUser(entity, user);
        return userRepository.save(entity);
    }

    public void updateUser(User entity, User user){
        entity.setEmail(user.getEmail());
        entity.setName(user.getName());
        entity.setPhone(user.getPhone());
    }
}
