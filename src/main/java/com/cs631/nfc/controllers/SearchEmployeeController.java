package com.cs631.nfc.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cs631.nfc.beans.Employee;
import com.cs631.nfc.beans.EmployeeAddRole;
import com.cs631.nfc.beans.Orders;
import com.cs631.nfc.repository.CustomerOrderRepository;
import com.cs631.nfc.repository.EmployeeRepository;

@Controller
@Component
public class SearchEmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private CustomerOrderRepository customerOrderRepository;

	@PostMapping("/employeeSearch")
	public ModelAndView employeeSearch(@ModelAttribute("employee") Employee employee, BindingResult result,
			Model model) {
		System.out.println("in search Employee controller");

		EmployeeAddRole employeeReturn = employeeRepository.searchByEmployeeId(employee.getEid());
		System.out.println(employeeReturn.toString());
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("employeeReturn", employeeReturn);

		if (employeeReturn.getRole() == 1) {
			System.out.println("warehouse employee");
			Orders[] unprocessedOrders = customerOrderRepository.searchUnprocessed();
			for (Orders orders : unprocessedOrders) {
				System.out.println(orders.toString());
			}
			modelAndView.addObject("unprocessedOrders", unprocessedOrders);
		}

		modelAndView.setViewName("employeeView");
		return modelAndView;
	}
//
//	@PostMapping("/employeeSearch/{eid}")
//	public ModelAndView warehouseEmployeeUpdate(@ModelAttribute("employee") Employee employee, @PathVariable("eid") int eid, BindingResult result,
//			ModelAndView modelAndView) {
//		System.out.println("in warehouseEmployeeUpdate controller");
//		System.out.println("eid: " + eid);
//		//ModelAndView modelAndView = new ModelAndView();
//
//		Optional<EmployeeAddRole> e = employeeRepository.findById(eid);
//		System.out.println(e.toString());
//		EmployeeAddRole employeeReturn = employeeRepository.searchByEmployeeId(1);
//
//		//EmployeeAddRole employeeReturn = new EmployeeAddRole();
//		System.out.println(employeeReturn.toString());
//
//		employeeReturn.setRole(2);
//		System.out.println(employeeReturn.toString());
//
//		modelAndView.addObject("employeeReturn", employeeReturn);
//
//		if (employeeReturn.getRole() == 1) {
//			System.out.println("warehouse employee");
//			Orders[] unprocessedOrders = customerOrderRepository.searchUnprocessed();
//			for (Orders orders : unprocessedOrders) {
//				System.out.println(orders.toString());
//			}
//			modelAndView.addObject("unprocessedOrders", unprocessedOrders);
//		}
//
//		modelAndView.setViewName("employeeView");
//		return modelAndView;
//	}

}
