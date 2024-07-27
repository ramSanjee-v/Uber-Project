package com.ram.services;

import java.util.List;

import com.ram.dto.DriverDto;
import com.ram.dto.RideDto;
import com.ram.dto.RideRequestDto;

public interface RiderService {
	
	RideRequestDto requestRide(RideRequestDto rideRequestDto);
	
    RideDto cancelRide(Long rideId);
	
	DriverDto rateDriver(Long rideId,Integer rating);
	
	RideDto getMyProfile();
	
	List<RideDto> getAllMyRides();

}
