package edu.mum.cs.waa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.mum.cs.waa.domain.User;
import edu.mum.cs.waa.service.UserService;

@Controller
@SessionAttributes("user")
public class welcomeController {
	
	/*@Autowired
	private UserService userService;*/
	
	@RequestMapping(value=("/"),method=RequestMethod.GET)
	public String ShowLoginForm(Model model){
		//model.addAttribute("role_admin", userService.findUserByRole("ROLE_ADMIN"));
		//model.addAttribute("role_user", userService.findUserByRole("ROLE_USER"));
		//return "Login";
		
		
		return "home/MainForm";
	}
	
	
	@RequestMapping(value=("/home"),method=RequestMethod.GET)
	public String ShowMainPage(Model model)
	{
		return "MainForm";
	}
		
	/*@RequestMapping(value=("/login"),method=RequestMethod.POST)
	public String WelcomePage(User user,Model model,RedirectAttributes redirectAttributes)
	{ 
		List<User> All_users=userService.findAllUsers();
		for(User u:All_users){
			if(user.getUserName().equalsIgnoreCase(u.getUserName()) && user.getPassword().equals(u.getPassword() && user.getRole().equals("ROLE_ADMIN"))){
				redirectAttributes.addFlashAttribute(user);
				return "redirect:/home";
			}
		}
		
	  model.addAttribute("message", "Please give Valid userName and Password");	
		return "Login";
	}

		
	
	
	@RequestMapping(value=("/Insur"),method=RequestMethod.GET)
	public String ShowInsuranceForm(Model model)
	{
		return "InsuranceForm";
	}
	
	*/
}
