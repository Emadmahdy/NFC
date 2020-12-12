package com.cs631.nfc.controllers;

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
import com.cs631.nfc.repository.CustomerRepository;

@Controller
public class Searchcontroller {

	@Autowired
	private CustomerRepository customerRepository;

	@PostMapping("/searchCustomer")
	public ModelAndView searchCustomer(@ModelAttribute("customer") Customer customer, BindingResult result, Model model) {
		System.out.println("in search controller");
		int id = customer.getCid(); System.out.println(id);
		
		Optional<CustomerAdd> customerReturn = customerRepository.searchById(customer.getCid());
		System.out.println(customerReturn.toString());
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject(customerReturn);
		modelAndView.addObject("customerReturn", customerReturn);
		modelAndView.setViewName("ViewCustomerInformation");
		return modelAndView;
	}

}
