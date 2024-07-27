package com.ram.entities;

import java.util.List;

import org.springframework.data.geo.Point;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="sp_Wallet")
@Getter
@Setter
public class Wallet {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne(fetch=FetchType.LAZY)
	private User user;
	
	private Double balance;
	
	@OneToMany(mappedBy = "wallet",fetch=FetchType.LAZY)
	private List<WalletTransaction> transaction;

}
