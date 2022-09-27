package spring.mongo.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import spring.mongo.entity.User;
import spring.mongo.service.SequenceGeneratorService;

@RestController
@CrossOrigin
public class searchrest{
	@Autowired 
	spring.mongo.repository.reposit reposit;
	
	

//http://localhost:8080/mongo/rest/

	
	
	//search user by parameter
			@GetMapping("/mongo/rest/search")
			public ResponseEntity getUserByRequestParam(@RequestParam("name") String name){
				List<User> user = reposit.findbyname(name);
				return new ResponseEntity<>(user,HttpStatus.OK);
				
			}
	
//Search user details by path
			@GetMapping("/mongo/rest/search/{name}")
			public ResponseEntity getUserByPathVariable(@PathVariable("name") String name) {
				List<User> user = reposit.findbyname(name);
				return new ResponseEntity<>(user,HttpStatus.OK);
				
			}

//getting all user details	
				@GetMapping("/mongo/rest/userall")
				@ResponseBody
				
				public List<User> findAllUsers() {
				    return (List<User>) reposit.findAll();
				}
	
	 
//getting only user names 	
				@GetMapping("/mongo/rest/userlist")
				@ResponseBody
				
				public ResponseEntity getUser() {
					List<Object>user=new ArrayList<>();
				    user= (List<Object>)reposit.findNameByPath();
				    return new ResponseEntity<>(user,HttpStatus.OK);
				}	
	
	
	
	
	
	
}