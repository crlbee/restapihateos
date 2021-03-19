package com.springtest.rest.restapi.service;

import com.springtest.rest.restapi.entity.Order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDAO extends JpaRepository<Order, Long>{
	
}
