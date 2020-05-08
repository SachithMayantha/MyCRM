package com.im.mycrm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.im.mycrm.entities.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Long>{
	
}
