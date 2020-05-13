package com.app.registration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.registration.model.User;
import com.app.registration.repository.RegistrationRepository;

@Service
public class RegistrationService {
	
	@Autowired
	private RegistrationRepository repo;
	
	public User saveUser(User user) {
		
		return repo.save(user);  
	}
	
	public User fetchUserByUserid(String user) {
		return repo.findByUserid(user);
	}
	
	
	public User fetchUserByUseridAndPassword(String user, String password) {
		return repo.findByUseridAndPassword(user, password);
	}

}
