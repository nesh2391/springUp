package org.twang.userController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.twang.Model.Pojos.MovieGenre;

@Controller
public class Controller_User {
	
	@Autowired
	MovieImpl movieImpl;
	
	@RequestMapping(value="/hello-eng",produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<String> sayHello(ModelMap map)
	{
		List<String> userList = new ArrayList<String>();
		userList.add("One");
		userList.add("Two");
		userList.add("Three");
		MovieGenre mg = new MovieGenre(""+UUID.randomUUID(),"Hello world");
		movieImpl.save(mg);
		movieImpl.list();
		
		return userList;
	}
}
