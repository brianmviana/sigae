package dev.brianmviana.sigae.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.brianmviana.sigae.model.User;
import dev.brianmviana.sigae.service.imple.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/{id}")
	public User indexById(@PathVariable Long id) {
		return userService.findOne(id);
	}
	
	
}
