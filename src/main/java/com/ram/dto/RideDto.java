package com.ram.dto;

import java.time.LocalDateTime;

import org.springframework.data.geo.Point;

import com.ram.entities.enums.PaymentMethod;
import com.ram.entities.enums.RideStatus;


public class RideDto {
	
    private Long id;
	private Point pickupLocation;
	private Point dropOffLocation;
	
	
	private LocalDateTime createdTime;
	private RiderDto rider;
	private DriverDto driver;
	private PaymentMethod paymentMethod;

	private RideStatus rideStatus;
	
	private Double fair;
	private LocalDateTime startedAt;
	private LocalDateTime endedAt;

}
