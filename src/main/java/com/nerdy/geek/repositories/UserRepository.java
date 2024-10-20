package com.nerdy.geek.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nerdy.geek.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
