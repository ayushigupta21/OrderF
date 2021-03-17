package com.project.Order.dto;

import java.time.LocalDate;
import java.util.List;

import com.project.Order.entity.Order;



public class OrderDTO {

	Integer orderid;
	Integer buyerid;
	double amount;
	LocalDate date;
	String address;
	String status;
	List<ProductsOrderedDTO> orderedProducts;
	public List<ProductsOrderedDTO> getOrderedProducts() {
		return orderedProducts;
	}
	public void setOrderedProducts(List<ProductsOrderedDTO> orderedProducts) {
		this.orderedProducts = orderedProducts;
	}
	public Integer getOrderid() {
		return orderid;
	}
	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}
	public Integer getBuyerid() {
		return buyerid;
	}
	public void setBuyerid(Integer buyerid) {
		this.buyerid = buyerid;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public OrderDTO() {
		super();
	}
	
	public OrderDTO(Integer orderid ,Integer buyerid ,double amount , LocalDate date , String address ,String status) {
		this.orderid=orderid;
		this.buyerid=buyerid;
		this.amount=amount;
		this.date=date;
		this.address=address;
		this.status=status;
	}
	
	
	//Entity to Dto
	public static OrderDTO valueOf(Order order) {
		OrderDTO orderDTO= new OrderDTO();
		orderDTO.setAddress(order.getAddress());
		orderDTO.setAmount(order.getAmount());
		orderDTO.setBuyerid(order.getBuyerid());
		orderDTO.setDate(order.getDate());
		orderDTO.setOrderid(order.getOrderid());
		orderDTO.setStatus(order.getStatus());
		return orderDTO;
	}
	
			
	//Converts DTO into Entity
	public Order createEntity() {
		Order order = new Order();
		order.setOrderid(this.getOrderid());
		order.setBuyerid(this.getBuyerid());
		order.setAmount(this.getAmount());
		order.setAddress(this.getAddress());
		order.setDate(this.getDate());
		order.setStatus(this.getStatus());
		return order;
	}
	
	
	@Override
	public String toString() {
		return "OrderDTO [Orderid=" + orderid + ",Buyerid=" + buyerid +",Date=" + date + ", Address=" + address + ", Amount=" + amount
				+ ", Status=" + status + "]";
	}
	
	
}

