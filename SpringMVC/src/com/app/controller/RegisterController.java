package com.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.DispatcherServlet;

import com.app.dto.RegisterDTO;

@Component
@RequestMapping("/")
public class RegisterController {
	
public RegisterController() {
	System.out.println(this.getClass().getName());
}
@RequestMapping(value="/register.do", method=RequestMethod.POST)
public String register(@ModelAttribute RegisterDTO registerdto,HttpServletRequest req) {
	if(registerdto.getName()!=null) {
		req.setAttribute("msg", "Register success");
		req.setAttribute("name", registerdto.getName());
		req.setAttribute("email", registerdto.getName());
	}
	System.out.println("register ...");
	return "/Register.jsp";
	
}
}
