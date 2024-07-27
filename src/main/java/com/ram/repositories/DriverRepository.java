package com.ram.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ram.entities.Driver;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long>{

}
