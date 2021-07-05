package com.pwc.crmapi.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name="Customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Customer_Id")
    private long customerId;
    @Column(name="Customer_Name",nullable = false,length = 100)
	private String name;
    @DateTimeFormat(iso = ISO.DATE)
    @Column(name="DOB")
	private LocalDate dob;
	
}
