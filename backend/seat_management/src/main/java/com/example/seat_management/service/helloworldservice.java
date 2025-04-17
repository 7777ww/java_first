package com.example.seat_management.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
@Service
public class helloworldservice 
{
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
}
