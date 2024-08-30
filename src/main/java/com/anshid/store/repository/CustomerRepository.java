package com.anshid.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anshid.store.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	Customer findByUsername(String username);
	Customer findByUsernameAndPassword(String username, String password);
	
	
}
