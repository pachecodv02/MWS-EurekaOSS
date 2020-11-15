package com.example.demo.controllers;

import com.example.demo.models.Detail;
import com.example.demo.services.DetailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="store1")
public class DetailsController {
    @Autowired
    DetailService service;

    @GetMapping(value = "/detail/{id}")
    public Detail getMethodName(@PathVariable Integer id){
        return this.service.getDetail(id);
    }

    @PostMapping(value="/detail")
    public Detail getMethodName(@RequestBody Detail order){
        return this.service.addDetal(order);
    }

}