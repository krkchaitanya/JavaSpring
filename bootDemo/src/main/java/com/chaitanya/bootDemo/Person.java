package com.chaitanya.bootDemo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class Person {

	@RequestMapping("/person")
	@ResponseBody
	public String personDetails() {
		return "welcome krkchaiatnya";
	}
}
