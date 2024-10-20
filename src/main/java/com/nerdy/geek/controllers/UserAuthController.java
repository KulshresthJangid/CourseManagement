package com.nerdy.geek.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.nerdy.geek.dtos.UserDTO;
import com.nerdy.geek.entities.UserEntity;
import com.nerdy.geek.services.DatabaseService;

@Controller(value = "/api/v1/user")
public class UserAuthController extends BaseController {
	
	@Autowired
	private DatabaseService databaseService;

	@GetMapping(value="/{id}")
	public ResponseEntity<UserDTO> getUserById(@PathVariable(value = "id") Long userId) {
		UserEntity user = databaseService.findUserById(userId);
	}
	
}
