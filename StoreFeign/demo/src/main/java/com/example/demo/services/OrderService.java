package com.example.demo.services;



import com.example.demo.models.Order;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name="orders-service", fallback = OrdersFallBack.class)
public interface OrderService {

    @RequestMapping("/orders/{id}")
    Order getOrder(@PathVariable Integer id);

    @PostMapping("/orders")
    Order addOrder(@RequestBody Order order);

    //@DeleteMapping("/orders/{id}")
    //Order deleteOrder(@RequestBody Order order, @PathVariable Integer id);
    
}