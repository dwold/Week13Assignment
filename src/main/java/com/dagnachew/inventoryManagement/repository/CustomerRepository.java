package com.dagnachew.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.dagnachew.inventoryManagement.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>{

}
