package com.example.demo.services;

import com.example.demo.models.Detail;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("details-service")
public interface DetailService {

    @RequestMapping("/details/{id}")
    Detail getDetail(@PathVariable Integer id);

    @PostMapping("/details")
    Detail addDetal(@RequestBody Detail order);
}