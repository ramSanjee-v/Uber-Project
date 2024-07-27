package com.ram.entities;

import java.time.LocalDateTime;
import java.util.Set;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.geo.Point;

import com.ram.entities.enums.PaymentMethod;
import com.ram.entities.enums.RideRequestStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

//@Entity
//@Getter
//@Setter
//public class RideRequestPostgres {
//	
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	private Long id;
//	
//	@Column(columnDefinition = "Geometry(Point,4326)")
//	private Point pickupLocation;
//	
//	@Column(columnDefinition = "Geometry(Point,4326)")
//	private Point dropupLocation;
//	
//	@CreationTimestamp
//	private LocalDateTime requestedTime;
//	
//	@ManyToMany(fetch=FetchType.LAZY)
//	private Rider rider;
//	
//	@Enumerated(EnumType.STRING)
//	private PaymentMethod paymentMethod;
//	
//	@Enumerated(EnumType.STRING)
//	private RideRequestStatus rideRequestStatus;
//	
//
//}
