package com.ram.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.ram.dto.RideRequestDto;
import com.ram.entities.Driver;
import com.ram.entities.Ride;
import com.ram.entities.enums.RideStatus;

public interface RideService {
	
	Ride getRideById(Long rideId);
	
	void matchWithDrivers(RideRequestDto rideRequestDto);
	
	Ride createNewRide(RideRequestDto rideRequestDto,Driver driver);
	
	Ride updateRideStatus(Long rideId,RideStatus rideStatus);
	
	Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest);
	
	Page<Ride> getAllRidesOfDriver(Long driverId, PageRequest pageRequest);

}
