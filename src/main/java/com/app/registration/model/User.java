package com.app.registration.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String userid;
private String password;
private String cpassword;
private long phoneno;
private String emailId;


public User() {
	
}

public User(int id, String userid, String password, String cpassword, long phoneno, String emailId) {
	super();
	this.id = id;
	this.userid = userid;
	this.password = password;
	this.cpassword = cpassword;
	this.phoneno = phoneno;
	this.emailId = emailId;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUserid() {
	return userid;
}
public void setUserid(String userid) {
	this.userid = userid;
}

public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

public String getCpassword() {
	return cpassword;
}

public void setCpassword(String cpassword) {
	this.cpassword = cpassword;
}

public long getPhoneno() {
	return phoneno;
}
public void setPhoneno(long phoneno) {
	this.phoneno = phoneno;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}


}
