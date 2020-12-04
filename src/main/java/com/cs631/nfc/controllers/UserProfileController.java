package com.cs631.nfc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.cs631.nfc.beans.Login;

@Controller
public class UserProfileController {

	@PostMapping("/userprofile")
	public String getUserProfile(@SessionAttribute("login") Login login, Model model) {
		System.out.println("in user profile controller");
		System.out.println("username from session: " + login.getUsername());
		model.addAttribute("username", login.getUsername());
		return "profile";
	}
}
