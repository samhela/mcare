package edu.waa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.waa.domain.UserDetail;
import edu.waa.domain.UserDetail;

@Controller
public class ClientController {
	
	@RequestMapping(value="/ShowClientForm",method=RequestMethod.GET)
	public String showClientForm(@ModelAttribute("newClient") UserDetail client,Model model){
		
		return "ClientRegistrationForm";
	}

}
