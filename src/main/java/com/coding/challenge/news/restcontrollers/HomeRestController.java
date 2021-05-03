package com.coding.challenge.news.restcontrollers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {

    @GetMapping("/")
    public String home(){
        return "Rest index";
    }
}
