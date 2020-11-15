package com.example.demo.services;

import com.example.demo.models.Order;

import org.springframework.stereotype.Component;

@Component
public class OrdersFallBack implements OrderService {

    @Override
    public Order addOrder(Order order) {
       Order orderDefault = new Order(); 
       orderDefault.setId(-1);
        return orderDefault;
    }

    @Override
    public Order getOrder(Integer id) {
        Order orderDefault = new Order(); 
       orderDefault.setId(-2);
        return orderDefault;
    }
    
}