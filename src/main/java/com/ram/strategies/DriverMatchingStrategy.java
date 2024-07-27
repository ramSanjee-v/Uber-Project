package com.ram.strategies;

import java.util.List;

import com.ram.dto.RideRequestDto;
import com.ram.entities.Driver;

public interface DriverMatchingStrategy {
	
	List<Driver> findMatchingDriver(RideRequestDto rideRequestDto);

}
