package com.dagnachew.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.dagnachew.inventoryManagement.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Long>{

}
