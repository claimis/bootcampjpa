package com.everis.bootcamp.bootcampjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.everis.bootcamp.bootcampjpa.service.MainService;
import com.everis.bootcamp.bootcampjpa.vet.Vet;


@Controller
public class PruebaController {
	
	@Autowired
	private MainService pruebaserv;
	
	
	
	@GetMapping("/prueba/hello")
	@ResponseBody
	public String prueba() {
		return "hello world" + this.pruebaserv.enviarService();
	}
	
	@GetMapping("/prueba/todos")
	@ResponseBody
	public List<Vet> repo() {
		return this.pruebaserv.getVets();
	}
}
