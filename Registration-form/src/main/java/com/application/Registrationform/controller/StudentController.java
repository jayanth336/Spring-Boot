package com.application.Registrationform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.application.Registrationform.domain.Student;

@Controller
public class StudentController {

	@GetMapping("/index")
	public String getForm(Model model) {
		model.addAttribute("Student", new Student());
		return "index";
	}
	
	@PostMapping("/registration")
	public String postForm(@ModelAttribute Student student, BindingResult result, Model model) {
		model.addAttribute("Student", student);
		return "registration";
	}

}
