package com.cs631.nfc.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

//import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cs631.nfc.beans.Customer;

@Controller
public class RegistrationController {

	//@Autowired
	//private com.cs631.nfc.repository.UserRepository userRepository;
	
	
	/*
	@PostMapping("/registeruser")
	public String registerUser(
			 @Valid  @ModelAttribute("newuser") Customer user, BindingResult result, Model model) {
		
		if (result.hasErrors()) {
			return "register";
		}
		
		System.out.println("in registery controller");
		//System.out.println(user.getDateOfBirth());
		//userRepository.save(user);
		model.addAttribute("dataSaved", "user registered successfully");
		return "login";
	}*/
}
