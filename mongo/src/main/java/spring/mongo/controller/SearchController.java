package spring.mongo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import spring.mongo.entity.User;
import spring.mongo.repository.reposit;


@Controller
public class SearchController {
	
	@Autowired
	reposit reposit;

	@PostMapping("/searchdata")
	public String searchdata(@RequestParam("name")String name, Model model)
	{
		List<User> user = new ArrayList<>();
		user = reposit.findbyname(name);
		model.addAttribute("users", user);
		return "show";
	}
}
