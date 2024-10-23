package com.nerdy.geek.dtos;

import org.springframework.http.HttpStatus;

import com.nerdy.geek.entities.UserEntity;

import lombok.Data;

@Data
public class ApiResponseDTO<T> {

	public HttpStatus status;
	public boolean success;
	public T body;
	public String message;

	ApiResponseDTO(T t, HttpStatus status, String msg, boolean success) {
		setStatus(status);
		setBody(t);
		setMessage(msg);
		setSuccess(success);
	}
}
