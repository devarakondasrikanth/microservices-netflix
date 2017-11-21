package com.srikanth.eureka.client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	 @RequestMapping("/greeting")
	    public String greeting() {
	        return "Hello from EurekaClient!";
	    }
}
