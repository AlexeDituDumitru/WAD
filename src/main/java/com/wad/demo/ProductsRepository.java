/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wad.demo;
import com.wad.datamodels.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



/**
 *
 * @author catalin
 */
@Repository
public interface ProductsRepository extends JpaRepository<Product, Long> {
    
}
