package com.cts.ZuulGateway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.ZuulGateway.security.AppUserDetailsService;
import com.cts.model.User;

@RestController
@RequestMapping("/users")
@CrossOrigin
public class UserController {
	@Autowired
	private AppUserDetailsService appUserDetailsService;
	
	@GetMapping("/{username}")
	public User getUser (@PathVariable String userName) {
		return appUserDetailsService.findByUserName(userName);
	}

}
