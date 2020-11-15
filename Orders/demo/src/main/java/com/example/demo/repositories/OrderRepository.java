package com.example.demo.repositories;

import com.example.demo.models.Order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OrderRepository  extends JpaRepository<Order, Integer>{
    
}