package com.cs631.nfc.controllers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.cs631.nfc.beans.Customer;
import com.cs631.nfc.beans.CustomerAdd;
import com.cs631.nfc.beans.Inventory;
import com.cs631.nfc.beans.Login;
import com.cs631.nfc.beans.Orders;

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
	
	@ModelAttribute("inventory")
	public Inventory addInventory() {
		return new Inventory();
	}
	
	@ModelAttribute("order")
	public Orders addOrder() {
		return new Orders();
	}
	
	@ModelAttribute("login")
	public Login getDefualtLogin() {
		return new Login();
	}
}
