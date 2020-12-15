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
import com.cs631.nfc.beans.Employee;
import com.cs631.nfc.beans.EmployeeAddRole;
import com.cs631.nfc.beans.Inventory;
import com.cs631.nfc.beans.Orders;
import com.cs631.nfc.repository.CustomerInventoryRepository;
import com.cs631.nfc.repository.CustomerOrderRepository;
import com.cs631.nfc.repository.CustomerRepository;
import com.cs631.nfc.repository.EmployeeRepository;

@Controller
public class SearchOrderController {

	@Autowired
	private CustomerInventoryRepository customerInventoryRepository;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private CustomerOrderRepository customerOrderRepository; 
	
	@Autowired
	private EmployeeRepository employeeRepository;


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

	
	
	@PostMapping("/markProccessed/{eid}")
	public ModelAndView markProccessed(@ModelAttribute("orders") Orders orders,@PathVariable("eid") int eid, BindingResult result, ModelAndView modelAndView) {
		System.out.println("in markProccessed controller");
		
		System.out.println("employee id: " + eid);
		int ordersReturn = customerOrderRepository.markProcessed(orders.getOid());
		System.out.println("update confirmation" + ordersReturn);
		//ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("ordersReturn", ordersReturn);
		modelAndView.addObject("employeeId", eid);
		System.out.println(modelAndView.getModelMap().toString());
		
		SearchEmployeeController s = new SearchEmployeeController();
		//s.warehouseEmployeeUpdate(new Employee(), eid, result,  model);
		
		
		EmployeeAddRole employeeReturn = employeeRepository.searchByEmployeeId(1);
		System.out.println(employeeReturn.toString());

		modelAndView.addObject("employeeReturn", employeeReturn);

		if (employeeReturn.getRole() == 1) {
			System.out.println("warehouse employee");
			Orders[] unprocessedOrders = customerOrderRepository.searchUnprocessed();
			for (Orders order : unprocessedOrders) {
				System.out.println(order.toString());
			}
			modelAndView.addObject("unprocessedOrders", unprocessedOrders);
		}

		modelAndView.setViewName("employeeView");
		
		return modelAndView;
	}
}
