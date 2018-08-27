package com.in28minutes.springmvc;

import javax.enterprise.inject.Model;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
@RequestMapping(value ="/login", method = RequestMethod.GET)

	public String loginGET()
	{
		return "login";
	}

@RequestMapping(value ="/login", method = RequestMethod.POST)

public String loginPOST(@RequestParam String name, ModelMap model,@RequestParam String password)
{
	if(password.equals("Password"))
	{
	 model.put("name",name);
	System.out.println(name);
	return "welcome";
	}
	else
	{
		model.put("errorMessage","Invalid Username or Password");
		return "loginfailed";
		
	}
}
}
