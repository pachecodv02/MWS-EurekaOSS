package com.example.demo.controllers;

import com.example.demo.services.BotService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BotController {

    @Autowired 
    BotService botService;

    @GetMapping("/bot/{message}")
    public String getBotResponse(@PathVariable String message) {
        return this.botService.getBotResponse(message);
    }
}