package com.pedroenrick.course.services;

import com.pedroenrick.course.entities.Category;
import com.pedroenrick.course.entities.Order;
import com.pedroenrick.course.repositories.CategoryRepository;
import com.pedroenrick.course.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
