package com.twang.usersController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	@RequestMapping(value="/hello-eng")
	public String sayHello(ModelMap map)
	{
		map.addAttribute("msg", "Hello, I am Spring");
		return "helloEng";
	}
	
	@RequestMapping(value="/hello-fr")
	public String sayHelloFR(ModelMap map)
	{
		map.addAttribute("msg", "Bonjour je suis Spring");
		return "helloFr";
	}
}
