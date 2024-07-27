package com.ram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UberApplication {

	public static void main(String[] args) {
		SpringApplication.run(UberApplication.class, args);
	}
	
	/*
	 * Tables Created
	 * select * from sp_rider;
       select * from user_roles;
       select * from sp_app_user;
       select * from sp_driver;
       select * from sp_Ride_Request
       select * from sp_Ride;
	 * */
	 

}
