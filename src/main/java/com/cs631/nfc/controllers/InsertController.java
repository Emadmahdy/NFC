package com.cs631.nfc.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cs631.nfc.beans.Address;
import com.cs631.nfc.beans.Customer;
import com.cs631.nfc.beans.CustomerAdd;
import com.cs631.nfc.repository.AddressRepository;
import com.cs631.nfc.repository.CustomerOnlyRepository;
import com.cs631.nfc.repository.CustomerRepository;
import com.cs631.nfc.repository.Customerrepo;

@Controller
public class InsertController {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired 
	private AddressRepository addressRepository;
	
	@Autowired
	private CustomerOnlyRepository customerOnlyRepository;
	
	@Autowired
	private Customerrepo customerrepo;
	
	

	@PostMapping("/insertCustomer")
	public ModelAndView searchCustomer(@ModelAttribute("customerAdd") CustomerAdd customerAdd, BindingResult result,
			Model model) {
		System.out.println("in insertCustomer controller");
		
		Address address = new Address();
		address.setAdd1(customerAdd.getAdd1());
		address.setAdd2(customerAdd.getAdd2());
		address.setCity(customerAdd.getCity());
		address.setState(customerAdd.getCity());
		address.setZip(customerAdd.getZip());

		System.out.println(address.toString());

		Customer customer = new Customer();
		customer.setfirstname(customerAdd.getFirstname());
		customer.setlastname(customerAdd.getLastname());
		customer.setDob(customerAdd.getDob());
		customer.setUsername(customerAdd.getUsername());
		customer.setPassword(customerAdd.getPassword());

		System.out.println(customer.toString());

		/*
		 * Address insertedAdd = customerRepository.saveAddress(address.getAdd1(),
		 * address.getAdd2(), address.getCity(), address.getState(), address.getZip());
		 */
		/*
		 * int aid = customerrepo.enterAdd(address.getAdd1(), address.getAdd2(),
		 * address.getCity(), address.getState(), address.getZip());
		 */
		
		Address insertedAdd = addressRepository.save(address);

		System.out.println("generated address ID: " + insertedAdd.getAid());
		customer.setaddid((int)insertedAdd.getAid());
		System.out.println(customer.toString());
		Customer insertedCustomer = customerOnlyRepository.save(customer);
		
		/*
		 * int cid = customerRepository.savecustomer(customer.getfirstname(),
		 * customer.getlastname(), customer.getDob(), customer.getUsername(),
		 * customer.getPassword(), customer.getaddid());
		 */
		 // System.out.println("generated customer ID: " + insertedCustomer.getCid());
		  
		 		ModelAndView modelAndView = new ModelAndView();
		//modelAndView.addObject(customerReturn);
		//modelAndView.addObject("customerReturn", customerReturn);
		modelAndView.setViewName("ViewCustomerInformation");
		return modelAndView;
	}

}