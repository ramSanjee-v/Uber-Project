package com.ram.entities;



import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import com.ram.entities.enums.TransactionMethod;
import com.ram.entities.enums.TransactionType;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="sp_Wallettransaction")
@Getter
@Setter
public class WalletTransaction {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	
	private Double amount;
	
	private TransactionType transactionType;
	private TransactionMethod transactionMethod;
	
	@OneToOne
	private Ride ride;
	
	private String transactionId;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Wallet wallet;
	
	@CreationTimestamp
	private LocalDateTime timeStamp;
	
	

}
