package com.kai.springbootkafkabeginner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final Producer producer;

    public Controller(Producer producer){
        this.producer = producer;
    }

    @GetMapping("/publish")
    public void messageToTopic(@RequestParam("message") String message){
        this.producer.sendMessage(message);
    }

}
