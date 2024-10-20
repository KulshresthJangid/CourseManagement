package com.nerdy.geek.dtos;

import com.nerdy.geek.enums.Roles;

import lombok.Data;

@Data
public class UserDTO extends BaseDTO {

	public Long id;
	public Long firstName;
	public Long lastName;
	public Long email;
	public Roles role;
}
