package com.example.demo.services;

import java.net.URI;

import com.example.demo.models.BotModel;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BotServiceImpl implements BotService {

    @Autowired
    RestTemplate template;

    @HystrixCommand(fallbackMethod = "fallbackReturn", commandProperties = {
        @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "500")
    })
    @Override
    public String getBotResponse(String request) {
        URI uri = URI.create("https://tecdemoaxity.azurewebsites.net/api/directmessage");
        BotModel botRequest = new BotModel();
        botRequest.setValue(request);
        botRequest.setGeneratedAudio(true);

        BotModel[] response = this.template.postForObject(uri, botRequest, BotModel[].class);

        return response[0].getValue();
    }
    
    public String fallbackReturn(String request){
        return "Bot no disponible";
    }
    
}