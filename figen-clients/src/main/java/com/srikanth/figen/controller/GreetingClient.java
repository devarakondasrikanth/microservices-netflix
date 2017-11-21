package com.srikanth.figen.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("eureka-client")
public interface GreetingClient {
	@RequestMapping("/greeting")
    String greeting();
}
