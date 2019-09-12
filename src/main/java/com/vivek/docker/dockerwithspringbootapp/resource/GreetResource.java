package com.vivek.docker.dockerwithspringbootapp.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("docker")
public class GreetResource {

	@GetMapping("/hello")
	public String sayHelloToUser() {
		
		return "Hello User.";
	}
	@GetMapping("/hello2")
	public String sayHelloToUserV2() {
		
		return "Hello Guest.";
	}
}
