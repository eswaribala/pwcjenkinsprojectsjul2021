package com.pwc.banking.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.pwc.banking.models.Customer;

class CustomerTest {

	private static Customer customer;
	
	@BeforeAll
	static void createInstance() {
		customer=new Customer();
	}
	
	@Test
	void CheckCustomerInstanceExistence() {
		
		assertTrue(customer!=null);
		
	}

}
