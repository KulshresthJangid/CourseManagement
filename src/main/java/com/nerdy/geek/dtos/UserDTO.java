package com.nerdy.geek.dtos;

import com.nerdy.geek.entities.UserEntity;
import com.nerdy.geek.enums.Roles;

import lombok.Data;

@Data
public class UserDTO extends BaseDTO {

	public Long id;
	public String firstName;
	public String lastName;
	public String email;
	public Roles role;
	
	UserDTO(UserEntity userEntity) {
		setId(userEntity.getId());
		setFirstName(userEntity.getFirstNames());
		setLastName(userEntity.getLastName());
		setEmail(userEntity.getEmail());
		setRole(userEntity.getRoles());
	}
}
