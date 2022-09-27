package spring.mongo.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import spring.mongo.entity.User;
import spring.mongo.service.SequenceGeneratorService;
@RestController
@CrossOrigin

public class newuserrest{
@Autowired 
spring.mongo.repository.reposit reposit;

@Autowired
private SequenceGeneratorService service;

//http://localhost:8080/mongo/rest/user/new

//New user
@PostMapping("/mongo/rest/user/new")  
public User createUser(@RequestBody User user)  
{  
	user.setId(service.getSequenceNumber(User.SEQUENCE_NAME));
	return reposit.save(user);    

	//return new ResponseEntity<>(user.getUname(),HttpStatus.OK);
}
}