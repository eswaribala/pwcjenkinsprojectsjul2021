package com.pwc.bankingapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pwc.bankingapi.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long>{

}
