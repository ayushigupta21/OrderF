package com.project.Order.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(ProdOrderCompositeKey.class)
@Table(name="productsordered")
public class ProductsOrdered {
	
	@Id
	@Column(name = "orderid")
	Integer orderid;
	
	@Id
	@Column(name = "prodid", nullable = false)
	Integer prodid;
	
	@Column(name="sellerid" , nullable = false)
	Integer sellerid;
	@Column(nullable = false)
	Integer quantity;
	@Column(nullable = false , length=60)
	String status;
	double price;
	
	public Integer getOrderid() {
		return orderid;
	}
	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}
	public Integer getProdid() {
		return prodid;
	}
	public void setProdid(Integer prodid) {
		this.prodid = prodid;
	}
	public Integer getSellerid() {
		return sellerid;
	}
	public void setSellerid(Integer sellerid) {
		this.sellerid = sellerid;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}

