package com.cs631.nfc.controllers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cs631.nfc.beans.Customer;
import com.cs631.nfc.beans.CustomerAdd;
import com.cs631.nfc.beans.Inventory;
import com.cs631.nfc.beans.Orders;
import com.cs631.nfc.repository.CustomerInventoryRepository;
import com.cs631.nfc.repository.CustomerOrderRepository;
import com.cs631.nfc.repository.CustomerRepository;

@Controller
public class SearchOrderController {

	@Autowired
	private CustomerInventoryRepository customerInventoryRepository;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private CustomerOrderRepository customerOrderRepository; 

	@PostMapping("/searchOrder")
	public ModelAndView searchCustomerOrder(@ModelAttribute("customer") Customer customer, BindingResult result, Model model) {
		System.out.println("in search order controller");
		
		Optional<CustomerAdd> customerReturn = customerRepository.searchById(customer.getCid());
		System.out.println(customerReturn.toString());
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("customerReturn", customerReturn);
		
		
		Orders[] returnOrder = customerOrderRepository.searchByCustomerId(customer.getCid());
		for (Orders order : returnOrder) {
			System.out.println(order.toString());
		}
		
		modelAndView.addObject("returnOrder", returnOrder);
		modelAndView.setViewName("ViewOrder");
		return modelAndView;
	}

}
