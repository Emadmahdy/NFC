package com.cs631.nfc.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.cs631.nfc.beans.Customer;
import com.cs631.nfc.beans.Login;

@ControllerAdvice
public class DefaultModelAttributeController {

	@ModelAttribute("newcustomer")
	public Customer getDefualtUser() {
		return new Customer();
	}
	
	
	
	@ModelAttribute("login")
	public Login getDefualtLogin() {
		return new Login();
	}
}
