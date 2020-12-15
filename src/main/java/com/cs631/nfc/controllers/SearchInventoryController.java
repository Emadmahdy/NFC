package com.cs631.nfc.controllers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cs631.nfc.beans.Customer;
import com.cs631.nfc.beans.CustomerAdd;
import com.cs631.nfc.beans.EmployeeAddRole;
import com.cs631.nfc.beans.Inventory;
import com.cs631.nfc.beans.Orders;
import com.cs631.nfc.repository.CustomerInventoryRepository;
import com.cs631.nfc.repository.CustomerRepository;

@Controller
public class SearchInventoryController {

	@Autowired
	private CustomerInventoryRepository customerInventoryRepository;
	
	@Autowired
	private CustomerRepository customerRepository;

	@PostMapping("/searchCustomerInventory")
	public ModelAndView searchCustomer(@ModelAttribute("customer") Customer customer, BindingResult result, Model model) {
		System.out.println("in search controller");
		
		Optional<CustomerAdd> customerReturn = customerRepository.searchById(customer.getCid());
		System.out.println(customerReturn.toString());
		ModelAndView modelAndView = new ModelAndView();
		//modelAndView.addObject(customerReturn);
		modelAndView.addObject("customerReturn", customerReturn);
		
		//Object[] returnInvobj = customerInventoryRepository.searchById(customer.getCid());
		//System.out.println(returnInvobj.toString());
		
		Inventory[] returnInv = customerInventoryRepository.searchById(customer.getCid());
		for (Inventory inventory : returnInv) {
			System.out.println(inventory.toString());
		}
		System.out.println(returnInv.toString());
		modelAndView.addObject("returnInv", returnInv);
		modelAndView.setViewName("ViewAvailableInventory");
		return modelAndView;
	}
	
	
	@PostMapping("/UpdateInventory/{iid}")
	public ModelAndView UpdateInventory(@ModelAttribute("inventory") Inventory inventory,@PathVariable("iid") int iid, BindingResult result, ModelAndView modelAndView) {
		System.out.println("in UpdateInventory controller");
		
		int newAmount = inventory.getAmount();
		int cid = inventory.getCid();
		System.out.println("new amount is: " + newAmount);
		System.out.println(inventory.getCid());
		
		int invReturn = customerInventoryRepository.UpdateInv(iid, newAmount);
		System.out.println("update confirmation" + invReturn);
		
		Inventory[] returnInv = customerInventoryRepository.searchById(cid);

		modelAndView.addObject("returnInv", returnInv);

		
		

		modelAndView.setViewName("ViewAvailableInventory");
		
		return modelAndView;
	}

}
