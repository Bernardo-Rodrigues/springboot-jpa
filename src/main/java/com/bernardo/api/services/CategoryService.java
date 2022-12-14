package com.bernardo.api.services;

import com.bernardo.api.entities.Category;
import com.bernardo.api.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Category findById(Integer id){
        return categoryRepository.findById(id).get();
    }
}
