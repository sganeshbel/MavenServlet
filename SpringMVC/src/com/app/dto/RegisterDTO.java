package com.app.dto;

import java.io.Serializable;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;


public class RegisterDTO implements Serializable {
private String name;
private String password;
private String emial;
private String mobile;

public RegisterDTO() {
System.out.println(this.getClass().getName());

}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getEmial() {
	return emial;
}

public void setEmial(String emial) {
	this.emial = emial;
}

public String getMobile() {
	return mobile;
}

public void setMobile(String mobile) {
	this.mobile = mobile;
}
}
