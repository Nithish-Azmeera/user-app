package spring.mongo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.mongo.entity.User;
import spring.mongo.repository.reposit;

@Controller
public class ShowController {

	
	@Autowired
	reposit reposit;
	
	@RequestMapping("/showdata")
	public String showdata(User users,Model model)
	{
		List<User> user = new ArrayList<>();
		user = (List<User>) reposit.findAll();
		model.addAttribute("users", user);
		return "search";
	}
}