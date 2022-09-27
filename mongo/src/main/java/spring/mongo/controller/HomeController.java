package spring.mongo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import spring.mongo.entity.User;

@Controller
public class HomeController {
	@GetMapping("/home")
	public String home()
	{
		return "input";
	}
	
	
	
	@PostMapping("/save")
	public String save()
	{
		return "/savedata";
	}
	@Autowired
	spring.mongo.repository.reposit User;
	
	@PostMapping("/savedata")
	public String savedata(@ModelAttribute("newuser")User user)
	{
		User.save(user);
		return "input";
	}

	
	
	
	@ModelAttribute("newuser")
	public User newuser()
	{
		return new User();
	}
}