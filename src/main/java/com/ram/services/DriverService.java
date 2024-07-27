package com.ram.services;

import java.util.List;

import com.ram.dto.DriverDto;
import com.ram.dto.RideDto;

public interface DriverService {
	
	RideDto cancelRide(Long rideId);
	
	RideDto startRide(Long rideId);
	
	RideDto endRide(Long rideId);
	
	RideDto rateRider(Long rideId,Integer rating);
	
	DriverDto getMyProfile();
	
	List<RideDto> getAllMyRides();
	

}
