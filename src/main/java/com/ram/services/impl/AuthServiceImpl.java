package com.ram.services.impl;

import org.springframework.stereotype.Service;

import com.ram.dto.DriverDto;
import com.ram.dto.SignupDto;
import com.ram.dto.UserDto;
import com.ram.services.AuthService;

@Service
public class AuthServiceImpl implements AuthService{

	@Override
	public String login(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto signup(SignupDto signupDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DriverDto onBoardNewDriver(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
