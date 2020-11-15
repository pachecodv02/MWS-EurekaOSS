package com.example.demo.controllers;

import com.example.demo.models.Order;
import com.example.demo.services.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="store")
public class StoreController {
    @Autowired
    OrderService orderService;

    @GetMapping(value = "/order/{id}")
    public Order getMethodName(@PathVariable Integer id){
        return this.orderService.getOrder(id);
    }

    @PostMapping(value="/order")
    public Order getMethodName(@RequestBody Order order){
        return this.orderService.addOrder(order);
    }
}