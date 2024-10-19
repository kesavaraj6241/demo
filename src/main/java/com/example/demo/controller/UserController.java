package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController   
public class UserController {
	
	@Autowired
	UserService userService;
	
@PostMapping("/adduserdetails")
public String addUser(@RequestBody User user) {
    
	User userDetails=userService.addUser(user);
	
	int id= userDetails.getId();
	if(userDetails!=null) {
		return "user details added for" +id;
	}else{
		return "user details added for" +id;
	}
}


@GetMapping("/getalluserdetails")
public List<User> getAllUserDetails(){
	
	List<User> allUserDetails=userService.getAllUserDetails();
	return allUserDetails;
	
}

	

}
