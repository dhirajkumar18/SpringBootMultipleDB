package com.dhiraj.multiple.dbconnection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dhiraj.multiple.dbconnection.mysql.entity.User;
import com.dhiraj.multiple.dbconnection.mysql.repository.UserRepository;
import com.dhiraj.multiple.dbconnection.postgresql.entity.Product;
import com.dhiraj.multiple.dbconnection.postgresql.repository.ProductRepository;

@RestController
@RequestMapping("/api")
public class DataController {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private ProductRepository productRepo;

    @PostMapping("/user")
    public User createUser(@RequestBody User user) {
        return userRepo.save(user);
    }

    @PostMapping("/product")
    public Product createProduct(@RequestBody Product product) {
        return productRepo.save(product);
    }
}
