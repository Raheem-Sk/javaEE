package com.VCenter.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ViewController {

	@GetMapping("/")
	public String Login() {
		return "login.html";
	}
	
	@GetMapping("/register")
	public String reg() {
		return "register.html";
	}
	
	@PostMapping("/login")
	public String verifier(@RequestParam("id") String id,@RequestParam("pass") String pass) {
		if(id.equalsIgnoreCase("a") && pass.equalsIgnoreCase("a")) {
			System.out.println(id+pass);
			return "redirect:Dashboard.html";
		}
		else
			return "redirect:error.html";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@GetMapping("/error")
	public String er() {
		return "error.html";
	}
}
