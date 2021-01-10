package com.dagnachew.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.dagnachew.inventoryManagement.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{

}
