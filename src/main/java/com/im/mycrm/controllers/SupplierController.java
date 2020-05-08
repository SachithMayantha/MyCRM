package com.im.mycrm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.im.mycrm.entities.Customer;
import com.im.mycrm.entities.Supplier;
import com.im.mycrm.repositories.SupplierRepository;

@RestController
public class SupplierController {
	@Autowired
	SupplierRepository supplierRepository;
	
	@GetMapping("/supplier")
	public List<Supplier> getSupplier(){
		return supplierRepository.findAll();
	}
	@GetMapping("/supplier/{id}")
	public Supplier getSupplier(@PathVariable Long id) {
		return supplierRepository.findById(id).get();
	}
	
}

