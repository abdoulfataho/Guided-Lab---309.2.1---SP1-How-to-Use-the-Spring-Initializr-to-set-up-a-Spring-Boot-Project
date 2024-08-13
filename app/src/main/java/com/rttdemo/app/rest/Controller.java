package com.rttdemo.app.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;

@RestController
public class Controller {

    @Value("${dragon.name}")
    private String dragon;

    @GetMapping("/")
    private String hello(){
        return "Hello world";
    }
    @GetMapping("/dragon")
    private String dragon(){
        return this.dragon ;
    }
    @GetMapping("/eat")
    private void eat(){
        System.out.println("I am hungry if it is almost lunch time");
    }

}
