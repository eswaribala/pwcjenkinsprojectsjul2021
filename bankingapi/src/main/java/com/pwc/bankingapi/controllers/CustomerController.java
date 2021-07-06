package com.pwc.bankingapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pwc.bankingapi.models.Customer;
import com.pwc.bankingapi.services.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/customers")
	public ResponseEntity<?> addCustomer(@RequestBody Customer customer){
		Customer customerObj=this.customerService.addCustomer(customer);
		if(customerObj!=null) {
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(customerObj);
		}
		else
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Customer Not Added");
		
		
	}
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomers(){
		return this.customerService.getAllCustomers();
	}

}
