/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wad.demo;

import com.wad.datamodels.Category;
import com.wad.datamodels.Product;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.Optional;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

/**
 *
 * @author catalin
 */
@RestController
@RequestMapping("/Categories")
public class CategoriesController {
    
    private CategoriesRepository categoriesRepo;
    
    public CategoriesController(CategoriesRepository repo)
    {
        categoriesRepo = repo;
    }
    @GetMapping()
    public List<Category> list() {
        return categoriesRepo.findAll();
    }
    
    @GetMapping("/{id}")
    public Category get(@PathVariable String id) {
        return null;
    }
    
    @GetMapping("/{id}/Products")
    public List<Product> get(@PathVariable Long id)
    {
        List<Product> retList = new ArrayList<>();
        Optional<Category> currentCategory = categoriesRepo.findById(id);
        if (currentCategory != null && currentCategory.isPresent())
        {
            retList = currentCategory.get().getProducts();
        }
        
        return retList;
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<?> put(@PathVariable String id, @RequestBody Category input) {
        return null;
    }
    
    @PostMapping
    public ResponseEntity<?> post(@RequestBody Category input) {
        return null;
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        return null;
    }
    
}
