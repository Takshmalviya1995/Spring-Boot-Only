package com.aartek.controller;




import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.model.User;
import com.aartek.serv.dao.UserServiceInt;

@Controller
//@RequestMapping(value={"\\WEB-INF\\jsp\\user"})
public class UserController {
	
	@Autowired
	private UserServiceInt userservice;
	final static Logger logger = Logger.getLogger(UserController.class);
	@RequestMapping(value= "/user", method=RequestMethod.GET)
	//@GetMapping(value = "/user")
	   public String showUser(Model model){
		logger.info("Inside controller");
		   logger.info("Inside controller : log");
		   model.addAttribute("userMap", new User());
		   return "user";
	   }
	@RequestMapping(value="/userSignIn", method=RequestMethod.POST)
	  public String userAction(@ModelAttribute("userMap")User user)
	  {
		logger.info("inside User Action");
		logger.info(user.getEmail());
		logger.info(user.getPassword());
		  
		  userservice.addUser(user);
		  return "hello";
		  
	  }
}

