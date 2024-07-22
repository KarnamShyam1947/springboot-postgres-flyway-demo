package com.shyam.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shyam.entities.ProductEntity;
import com.shyam.repositories.ProductRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {

    private final ProductRepository repository;
    
    @GetMapping("/all")
    public List<ProductEntity> getAllProducts() {
        return repository.findAll();
    }

}
