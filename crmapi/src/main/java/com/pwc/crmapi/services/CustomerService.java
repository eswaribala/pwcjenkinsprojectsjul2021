package com.pwc.crmapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pwc.crmapi.models.Customer;
import com.pwc.crmapi.repositories.CustomerRepository;

@Service
public class CustomerService {
    @Autowired
	private CustomerRepository customerRepository;
    
    public Customer addCustomer(Customer customer) {
    	return this.customerRepository.save(customer);
    }
    
    public List<Customer> getAllCustomers(){
    	return this.customerRepository.findAll();
    }
}
