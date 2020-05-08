package com.im.mycrm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.im.mycrm.entities.Customer;
import com.im.mycrm.repositories.CustomerRepository;

@RestController
public class CustomerController {

	@Autowired
	CustomerRepository customerRepository;
	
	@GetMapping("/customers")
	public List<Customer> getCustomers(){
		return customerRepository.findAll();
	}
	
	@GetMapping("/customer/{id}")
	public Customer getCustomer(@PathVariable Long id) {
		return customerRepository.findById(id).get();
	}
	
	
	@PostMapping("/customer")
	public Customer createCustomer(Customer customer){
		return customerRepository.save(customer);
	}
	
	@DeleteMapping("/customer/{id}")
	public boolean deleteCustomer(@PathVariable Long id){
		customerRepository.deleteById(id);
		return true;
	}
	
	
}
