package com.everis.bootcamp.bootcampjpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JPAController {
	
	@GetMapping("/jpa/hello")
	@ResponseBody
	public String prueba() {
		return "JPA Prueba";
	}
}