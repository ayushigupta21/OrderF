package com.project.Order.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Order.entity.ProdOrderCompositeKey;
import com.project.Order.entity.ProductsOrdered;



public interface ProductsOrderedRepository extends JpaRepository<ProductsOrdered, ProdOrderCompositeKey>{
	
	public List<ProductsOrdered> findByOrderid(Integer orderid);

}

