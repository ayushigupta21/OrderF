package com.project.Order.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ProdOrderCompositeKey implements Serializable {

	private int orderid;
	private int prodid;

	//parameterless constructor
	public ProdOrderCompositeKey() {
		super();
	}
	
	
	//parameterised constructor
	public ProdOrderCompositeKey(int orderid, int prodid) {
		super();
		this.orderid = orderid;
		this.prodid = prodid;
	}


	//equals and hashcode methods
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + orderid;
		result = prime * result + prodid;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProdOrderCompositeKey other = (ProdOrderCompositeKey) obj;
		if (orderid != other.orderid)
			return false;
		if (prodid != other.prodid)
			return false;
		return true;
	}
	
	
}
