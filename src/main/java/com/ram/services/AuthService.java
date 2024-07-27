package com.ram.services;

import com.ram.dto.DriverDto;
import com.ram.dto.SignupDto;
import com.ram.dto.UserDto;

public interface AuthService {
	
	String login(String email, String password);
	
	UserDto signup(SignupDto signupDto);
	
	DriverDto onBoardNewDriver(Long userId);

}
