package com.project.Order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Order.entity.Order;



public interface OrderRepository extends JpaRepository<Order, Integer> {
	
	public Order findByOrderid(Integer orderid);

}

