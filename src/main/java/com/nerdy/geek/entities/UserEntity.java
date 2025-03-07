package com.nerdy.geek.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.nerdy.geek.enums.Roles;

import lombok.Data;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name = "users")
@Data
public class UserEntity extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, unique = true, length = 45)
	private String email;

	@Column(nullable = false, unique = true, length = 45)
	private String password;

	@Column(name = "first_name", nullable = false, length = 20)
	private String firstNames;

	@Column(name = "last_name")
	private String lastName;
	
	// learn about @enumerated annotation
	@Column(nullable=false)
	private Roles role;

}
