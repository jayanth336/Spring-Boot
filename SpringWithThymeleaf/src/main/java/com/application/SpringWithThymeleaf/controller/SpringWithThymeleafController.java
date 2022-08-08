package com.application.SpringWithThymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SpringWithThymeleafController {
	
	@GetMapping({"/login", "/ViewThis1"})
	public String loggingIn(@RequestParam(value="name", defaultValue = "Default User", required = true) String name, Model model) {
		model.addAttribute("name", name);
		return "ViewThis1";
	}

	@GetMapping({"/logout", "/ViewThis2"})
	public String loggingOut(@RequestParam(value="name", defaultValue = "Default User" ,required = true) String name, Model model) {
		model.addAttribute("name", name);
		return "ViewThis2";
	}
	
	/*
	 @GetMapping({"/login", "/ViewThis1"})
	public String loggingIn(@RequestParam(value="name"----> word to be mentioned in URL, defaultValue = "Default User", required = true) String name---->A name to be given by us, Model model) {
		model.addAttribute("name", name); ---->Model binds the word name and a name we give, and displays it accordingly
		return "ViewThis1";
	} URL below
	http://localhost:8080/login?name=Jayanth
	How should the output be, is given in HTML file
	RequestParam----> Properties of URL
	PathVariable----> Obtain data from URL*/
}