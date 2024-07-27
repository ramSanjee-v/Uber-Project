package com.ram.strategies.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ram.dto.RideRequestDto;
import com.ram.entities.Driver;
import com.ram.strategies.DriverMatchingStrategy;

@Service
public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy {

	@Override
	public List<Driver> findMatchingDriver(RideRequestDto rideRequestDto) {
		// TODO Auto-generated method stub
		return List.of();
	}

}
