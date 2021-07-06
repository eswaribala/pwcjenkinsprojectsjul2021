package com.pwc.bankingapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pwc.bankingapi.models.Customer;
import com.pwc.bankingapi.repositories.CustomerRepository;

@Service
public class CustomerService {
    @Autowired
	private CustomerRepository customerRepository;
    
    //save
    public Customer addCustomer(Customer customer) {
    	return this.customerRepository.save(customer);
    }
    
    //get
    public List<Customer> getAllCustomers(){
    	return this.customerRepository.findAll();
    }
}
