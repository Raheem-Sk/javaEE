package com.SpringSecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontController {
	
	@GetMapping("/")
	public String Home() {
		return "Wellcome Page";
	}

}
