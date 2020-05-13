package com.app.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.registration.model.User;
public interface RegistrationRepository extends JpaRepository<User, Integer> {

	public User findByUserid(String user);
	public User findByUseridAndPassword(String user, String password);

}
