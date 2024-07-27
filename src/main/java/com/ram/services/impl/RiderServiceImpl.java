package com.ram.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ram.dto.DriverDto;
import com.ram.dto.RideDto;
import com.ram.dto.RideRequestDto;
import com.ram.services.RiderService;

@Service
public class RiderServiceImpl implements RiderService{

	@Override
	public RideRequestDto requestRide(RideRequestDto rideRequestDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RideDto cancelRide(Long rideId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DriverDto rateDriver(Long rideId, Integer rating) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RideDto getMyProfile() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RideDto> getAllMyRides() {
		// TODO Auto-generated method stub
		return null;
	}

}
