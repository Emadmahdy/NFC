package com.cs631.nfc.controllers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.cs631.nfc.beans.Customer;
import com.cs631.nfc.beans.CustomerAdd;
import com.cs631.nfc.beans.Login;

@ControllerAdvice
public class DefaultModelAttributeController {

	@ModelAttribute("customer")
	public Customer getDefualtUser() {
		return new Customer();
	}
	
	@ModelAttribute("customerAdd")
	public CustomerAdd getCustomer() {
		return new CustomerAdd();
	}
	
	
	
	@ModelAttribute("login")
	public Login getDefualtLogin() {
		return new Login();
	}
}
