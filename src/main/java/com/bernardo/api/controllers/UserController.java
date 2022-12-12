package com.bernardo.api.controllers;

import com.bernardo.api.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @GetMapping
    public ResponseEntity<User> list(){
        User user = new User(1, "Maria", "maria@gmail.com", "9999999", "12345");
        return ResponseEntity.ok().body(user);
    }
}
