package com.teste.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")

public class testeController {
	
	@GetMapping
	public String teste() {
		return "Finalizar a semana com conhecimentos básicos em Spring.";
	}

}