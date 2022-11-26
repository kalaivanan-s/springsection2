package com.eazybytes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class LogoutController {
	
	
	 @GetMapping("/logout")
	    public String registration(Model model) {
	       

	        return "logout";
	    }

}
