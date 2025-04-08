package com.datastore.person.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcomecontroller {
	
    @GetMapping("/welcome")
    public String welcome() {
    	return "welcome to spring boot application1";
    }
}


