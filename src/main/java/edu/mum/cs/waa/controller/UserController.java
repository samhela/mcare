package edu.mum.cs.waa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.cs.waa.domain.User;
import edu.mum.cs.waa.domain.UserDetail;
import edu.mum.cs.waa.service.UserService;

@Controller
public class UserController {
	
	/*@Autowired
	UserService userService;*/
		
	@RequestMapping(value="/ShowUserForm",method=RequestMethod.GET)
	public String showClientForm(@ModelAttribute("newUser") User user,Model model){
		
		return "user/UserRegistrationForm";
	}
	
	@RequestMapping(value="/ShowUserForm",method=RequestMethod.POST)
	public String AddUserForm(@ModelAttribute("newUser") User user,Model model){
		
		return "redirect:/showUser";
	}
	
	@RequestMapping(value="showUser",method=RequestMethod.GET)
	public String showUserList(){
		
		return "UserListForm";
	}
	
	
	
	
	
}
