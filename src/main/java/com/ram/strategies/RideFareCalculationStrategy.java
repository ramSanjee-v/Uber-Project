package com.ram.strategies;

import com.ram.dto.RideRequestDto;

public interface RideFareCalculationStrategy {
	
	double calculateFare(RideRequestDto rideRequestDto);

}
