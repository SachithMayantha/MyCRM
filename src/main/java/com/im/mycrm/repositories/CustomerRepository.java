package com.im.mycrm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.im.mycrm.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
	
}
