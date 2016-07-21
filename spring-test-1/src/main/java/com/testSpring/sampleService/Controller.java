package com.testSpring.sampleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.testSpring.functionality.SimpleFunRules;

@RestController
public class Controller {

	@Autowired
	SimpleFunRules simpleFunRules;
	
	@RequestMapping(value={"/test","/"}, method=RequestMethod.GET)
	public String pingBackValue()
	{
		return "Hello World"+simpleFunRules.sum();
	}
}
