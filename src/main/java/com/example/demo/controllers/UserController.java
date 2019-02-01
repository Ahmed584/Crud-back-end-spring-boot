package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;


@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository ;
	
	
	@CrossOrigin
	@GetMapping("/users")
	public List<User> getUsers(){
		return userRepository.findAll();
	}
	
	
	/*get User by id*/
	@CrossOrigin
	@GetMapping("/user/{id}")
	public Optional<User> getUser(@PathVariable Long id){
		return userRepository.findById(id);
	}
	
	
	/*delete User by id*/
	@CrossOrigin
	@DeleteMapping("/deleteUser/{id}")
	public Boolean deleteUser(@PathVariable Long id){
		userRepository.deleteById(id);
		
		return true;
	}
	
	/*create user*/
	@CrossOrigin
	@PostMapping("/user")
	public User createUser(@RequestBody User user) {
		return userRepository.save(user);
	}
	
	/*update user*/
	@CrossOrigin
	@PutMapping("/update")
	public Boolean updateUser(@RequestBody User user){
		userRepository.save(user);
		return true;
	}

}
