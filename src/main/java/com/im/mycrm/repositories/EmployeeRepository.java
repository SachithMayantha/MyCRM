package com.im.mycrm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.im.mycrm.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
