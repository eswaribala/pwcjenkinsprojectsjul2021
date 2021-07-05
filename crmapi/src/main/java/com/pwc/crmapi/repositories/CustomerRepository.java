package com.pwc.crmapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pwc.crmapi.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long>{

}
