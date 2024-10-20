package com.nerdy.geek.dtos;

import org.springframework.http.HttpStatus;

import lombok.Data;

@Data
public class ApiResponseDTO<T> {

	public HttpStatus status;
	public boolean success;
	public T body;
	public String message;
}
