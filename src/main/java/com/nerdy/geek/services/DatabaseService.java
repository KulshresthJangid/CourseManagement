package com.nerdy.geek.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nerdy.geek.entities.UserEntity;
import com.nerdy.geek.repositories.UserRepository;

@Component
public class DatabaseService {

	@Autowired
	private UserRepository userRepo;

	public UserEntity findUserById(Long id) {
		Optional<UserEntity> userEntity = userRepo.findById(id);
		if (userEntity.isPresent()) {
			return userEntity.get();
		}
		return null;
	}

	public UserEntity save(UserEntity user) {
		return userRepo.save(user);
	}

}
