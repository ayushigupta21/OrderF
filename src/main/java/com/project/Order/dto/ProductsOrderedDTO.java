package com.project.Order.dto;

import com.project.Order.entity.ProductsOrdered;

public class ProductsOrderedDTO {

	Integer orderid;
	Integer prodid;
	Integer sellerid;
	Integer quantity;
	String status;
	double price;
	
	public  ProductsOrderedDTO() {
		super();
	}
	
	public  ProductsOrderedDTO(Integer orderid ,Integer prodid ,Integer sellerid ,Integer quantity ,String status ,double price) {
		this.orderid=orderid;
		this.prodid=prodid;
		this.sellerid=sellerid;
		this.quantity=quantity;
		this.status=status;
		this.price=price;
	}

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
	
	
	public static ProductsOrderedDTO valueOf(ProductsOrdered productsOrdered) {
		ProductsOrderedDTO ProdOrderDTO= new ProductsOrderedDTO();
		ProdOrderDTO.setSellerid(productsOrdered.getSellerid());
		ProdOrderDTO.setOrderid(productsOrdered.getOrderid());
		ProdOrderDTO.setPrice(productsOrdered.getPrice());
		ProdOrderDTO.setProdid(productsOrdered.getProdid());
		ProdOrderDTO.setQuantity(productsOrdered.getQuantity());
		ProdOrderDTO.setStatus(productsOrdered.getStatus());
		return ProdOrderDTO;
	}
	
	public ProductsOrdered createEntity() {
		ProductsOrdered productsOrdered = new ProductsOrdered();
		productsOrdered.setOrderid(this.getOrderid());
		productsOrdered.setPrice(this.getPrice());
		productsOrdered.setProdid(this.getProdid());
		productsOrdered.setQuantity(this.getQuantity());
		productsOrdered.setSellerid(this.getSellerid());
		productsOrdered.setStatus(this.getStatus());
		return productsOrdered;
	}
	@Override
	public String toString() {
		return "ProdOrderedDTO [Orderid=" + orderid + ",Prodid=" + prodid +",Sellerid=" + sellerid + ",Price=" + price +",Status=" + status + ",Quantity=" + quantity + "]";
	}
	
}

