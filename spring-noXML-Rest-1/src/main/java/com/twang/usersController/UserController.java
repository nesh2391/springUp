package com.twang.usersController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.twang.util.OrderedPair;

@Controller
@ResponseBody
public class UserController<K, V> implements UserActions<K, V>  {

	@RequestMapping(value="/hello-eng",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<String> sayHello(ModelMap map)
	{
		List<String> userList = new ArrayList<String>();
		userList.add("One");
		userList.add("Two");
		userList.add("Three");
		return userList;
	}
	
	
	@RequestMapping(value="/hello-eng",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<String> getUsers2(ModelMap map)
	{
		List<String> userList = new ArrayList<String>();
		userList.add("One");
		userList.add("Two");
		userList.add("Three");
		return userList;
	}

	@Override
	@RequestMapping(value="{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public OrderedPair<String, List> getUsers() {
		List<String> userList = new ArrayList<String>();
		userList.add("One");
		userList.add("Two");
		userList.add("Three");
		OrderedPair<String, List> op = new OrderedPair<String, List>("userList", userList);
		return op;
	}
}
