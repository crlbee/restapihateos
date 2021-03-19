package com.springtest.rest.restapi.service;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springtest.rest.restapi.entity.*;


public interface EmployeeDAO extends JpaRepository<Employee, Long>{
	
}
