package com.cs631.nfc.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class HomeContoller {

	@GetMapping("/home")
	public String gohome() {
		System.out.println("We are in home controller");
		return "index";
	}
	
	@GetMapping("/goToSearch")
	public String goToSearch() {
		System.out.println("We are in search controller");
		return "search";
	}
	
	@GetMapping("/goToLogin")
	public String goToLogin() {
		System.out.println("We are in login controller");
		return "login";
	}
	
	@GetMapping("/goToRegistration")
	public String goToRegistration() {
		System.out.println("We are in register controller");
		return "register";
	}
	
	
}
