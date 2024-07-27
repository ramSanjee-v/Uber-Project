package com.ram.dto;

import java.time.LocalDateTime;


import org.springframework.data.geo.Point;

import com.ram.entities.Rider;
import com.ram.entities.enums.PaymentMethod;
import com.ram.entities.enums.RideRequestStatus;



public class RideRequestDto {
	
    private Long id;
	private Point pickupLocation;
	private Point dropOffLocation;
	private LocalDateTime requestedTime;
	private RiderDto rider;
	private PaymentMethod paymentMethod;
	private RideRequestStatus rideRequestStatus;

}
