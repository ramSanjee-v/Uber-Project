package com.ram.entities;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.geo.Point;

import com.ram.entities.enums.PaymentMethod;
import com.ram.entities.enums.RideRequestStatus;
import com.ram.entities.enums.RideStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name="sp_Ride")
public class RidePostgres {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(columnDefinition = "Geometry(Point,4326)")
	private Point pickupLocation;
	
	@Column(columnDefinition = "Geometry(Point,4326)")
	private Point dropOffLocation;
	
	@CreationTimestamp
	private LocalDateTime createdTime;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Rider rider;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Driver driver;
	
	@Enumerated(EnumType.STRING)
	private PaymentMethod paymentMethod;
	
	@Enumerated(EnumType.STRING)
	private RideStatus rideStatus;
	
	private Double fair;
	private LocalDateTime startedAt;
	private LocalDateTime endedAt;
	


}
