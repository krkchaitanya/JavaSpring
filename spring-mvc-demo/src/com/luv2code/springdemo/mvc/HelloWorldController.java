package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
//	need a initial controller method to show the HTML
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld_form";
	}
	
	
//	need a controller method to process the form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	
//read form data
//	add data to model
	
	

}
