package com.bernardo.api.services;

import com.bernardo.api.entities.Order;
import com.bernardo.api.entities.User;
import com.bernardo.api.repositories.OrderRepository;
import com.bernardo.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll(){
        return orderRepository.findAll();
    }

    public Order findById(Integer id){
        return orderRepository.findById(id).get();
    }
}
