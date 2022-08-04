package com.helloWorldApplication.HelloWorld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class HelloWorldController {
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello World";
	}
	
	@RequestMapping("/goodBye")
	public String sayBye() {
		return "Good Bye";
	}

}
