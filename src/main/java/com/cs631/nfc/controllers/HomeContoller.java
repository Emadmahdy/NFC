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
	
	@GetMapping("/ViewCustomerInformation")
	public String ViewCustomerInformation() {
		System.out.println("We are in ViewCustomerInformation controller");
		return "ViewCustomerInformation";
	}
	
	
	@GetMapping("/addNewCustomer")
	public String addNewCustomer() {
		System.out.println("We are in addNewCustomer controller");
		return "addNewCustomer";
	}
	
	
	
	@GetMapping("/addNewInventory")
	public String addNewInventory() {
		System.out.println("We are in addNewInventory controller");
		return "addNewInventory";
	}
	
	
	@GetMapping("/ViewAvailableInventory")
	public String ViewAvailableInventory() {
		System.out.println("We are in ViewAvailableInventory controller");
		return "ViewAvailableInventory";
	}
	
	@GetMapping("/ViewOrder")
	public String ViewOrder() {
		System.out.println("We are in ViewOrder controller");
		return "ViewOrder";
	}
	
	@GetMapping("/addNewOrder")
	public String addNewOrder() {
		System.out.println("We are in addNewOrder controller");
		return "addNewOrder";
	} 
	
	@GetMapping("/employeeView")
	public String employeeView() {
		System.out.println("We are in employeeView controller");
		return "employeeView";
	}
	
	@GetMapping("/employeeView/{eid}")
	public String employeeViewUpdate() {
		System.out.println("We are in employeeView controller");
		return "employeeView";
	}
	
	@GetMapping("/UpdateInventory/{iid}")
	public String UpdateInventory() {
		System.out.println("We are in employeeView controller");
		return "ViewAvailableInventory";
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
