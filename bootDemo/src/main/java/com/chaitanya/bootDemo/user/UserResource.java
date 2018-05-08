package com.chaitanya.bootDemo.user;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource {
	
	
//	importing the service by Auto wired annotation....@Component is a bean managed by spring...
	@Autowired
	private UserDaoService service;

	
	
//Retrieve all users
//	Get/users
	@GetMapping(path="/users")
	public List<User> retrieveAllUsers(){
		return service.findAll();
	}
	
	
//	Get/users/{id}... path variable
	@GetMapping(path="/users/{id}")
	public User retrieveUser(@PathVariable int id) {
		User user=service.findOne(id);
		if(user==null) {
			throw new UserNotFoundException("id-"+id);
			
		}
		return user;
	}
	
	
	
//input details of user
//	output- Created and return the created uri
//	post
	@PostMapping(path="/users")
	public ResponseEntity<Object> createUser(@RequestBody User user) {
		User savedUser=service.save(user);
        //we have to return the response
		
		URI location=ServletUriComponentsBuilder
		.fromCurrentRequest()
		.path("/{id}")
		.buildAndExpand(savedUser.getId()).toUri();
		
		return ResponseEntity.created(location).build();
	}
	
}