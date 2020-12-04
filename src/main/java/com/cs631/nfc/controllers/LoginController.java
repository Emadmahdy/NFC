package com.cs631.nfc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cs631.nfc.beans.Customer;
import com.cs631.nfc.beans.Login;
import com.cs631.nfc.exception.ApplicationException;
//import com.cs631.nfc.repository.UserRepository;

@Controller
@SessionAttributes("login") // make sure that the model attribute by the same name exist in our controller
public class LoginController {

	//@Autowired
	//private UserRepository userRepository;
	
	/*
	 * //needed if we did not have the default model attribute controller
	 * 
	 * @ModelAttribute public Login getDefaultLogin() { return new Login(); }
	 */
	/*
	@PostMapping("/login")
	public String login(@ModelAttribute("login") Login login) {
		Customer user = userRepository.searchByName(login.getUsername());
		if (user==null) {
			throw new ApplicationException("user was not found");	
		}
		return "forward:/userprofile";
	}*/
	
	/*
	 * @ExceptionHandler(ApplicationException.class) public String handelException()
	 * { System.out.println("in exception handeller of login controller"); return
	 * "error"; }
	 */
}
