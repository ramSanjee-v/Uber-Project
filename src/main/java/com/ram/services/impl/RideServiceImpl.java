package com.ram.services.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.ram.dto.RideRequestDto;
import com.ram.entities.Driver;
import com.ram.entities.Ride;
import com.ram.entities.enums.RideStatus;
import com.ram.services.RideService;

@Service
public class RideServiceImpl implements RideService {

	@Override
	public Ride getRideById(Long rideId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void matchWithDrivers(RideRequestDto rideRequestDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Ride createNewRide(RideRequestDto rideRequestDto, Driver driver) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ride updateRideStatus(Long rideId, RideStatus rideStatus) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Ride> getAllRidesOfDriver(Long driverId, PageRequest pageRequest) {
		// TODO Auto-generated method stub
		return null;
	}

}
