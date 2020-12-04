package com.cs631.nfc.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogoutController {

	@GetMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		System.out.println("ending user session");
		//System.out.println(session.getAttribute("login"));
		return "login";	
	}
}
