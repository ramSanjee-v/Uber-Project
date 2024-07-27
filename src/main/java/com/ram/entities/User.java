package com.ram.entities;

import java.util.Set;

import com.ram.entities.enums.Role;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="sp_app_user")
@Getter
@Setter
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Id;
	private String name;
	@Column(unique = true)
	private String email;
	private String password;
	
	@ElementCollection(fetch=FetchType.LAZY)
	@Enumerated(EnumType.STRING)
	private Set<Role> roles;

}
