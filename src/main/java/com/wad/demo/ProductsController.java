/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wad.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import com.wad.datamodels.Product;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author catalin
 */
@RestController
@RequestMapping("/Products")

public class ProductsController {   
    
    private ProductsRepository productsRepository;
    
    @Autowired
    ProductsController(ProductsRepository repo)
    {
        productsRepository=repo;
    }
    @GetMapping()
    public List<Product> list() {
        
        List<Product> retList = productsRepository.findAll();
        
        //retList.add(new Product(Integer.toUnsignedLong(1), "TestProd number 2", "This is a description for a second test product", 12.0 ));
            
        return retList;
    }
    
    @GetMapping("/{id}")
    public Object get(@PathVariable String id) {
        return null;
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<?> put(@PathVariable String id, @RequestBody Object input) {
        return null;
    }
    
    @PostMapping
    public ResponseEntity<?> post(@RequestBody Object input) {
        return null;
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        return null;
    }
    
}
