package com.app.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.registration.model.User;
import com.app.registration.service.RegistrationService;

@RestController
public class RegistrationController {
	
	@Autowired
    private RegistrationService service;
	
	
	@PostMapping("/login")
	@CrossOrigin(origins = "http://localhost:4201")
	public User loginUser(@RequestBody User user) throws Exception {
		String tempUserid = user.getUserid() ;
		String tempPass = user.getPassword();
		User userObj = null;
		if(tempUserid != null && tempPass != null) {
			userObj = service.fetchUserByUseridAndPassword(tempUserid, tempPass);
		}
		
		if(userObj ==null) {
			throw new Exception("Bad credentials");
		}
		return userObj;
		
	}  
	
	@PostMapping("/registeruser")
	@CrossOrigin(origins = "http://localhost:4201")
	public User registerUser(@RequestBody User user) throws Exception {
		String tempUserid = user.getUserid();
		if(tempUserid != null && !"".equals(tempUserid)) {
			User userobj = service.fetchUserByUserid(tempUserid);
			if(userobj !=null) {
				throw new Exception("user with "+ tempUserid+ " is already exixts");
			}
		}
		
		User userObj = null;
		userObj = service.saveUser(user);
		return userObj;	 
	}
	
	
}
