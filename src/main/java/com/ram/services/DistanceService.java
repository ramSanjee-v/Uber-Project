package com.ram.services;

import org.springframework.data.geo.Point;

public interface DistanceService {
	
	double calculateDistance(Point src,Point dest);

}
