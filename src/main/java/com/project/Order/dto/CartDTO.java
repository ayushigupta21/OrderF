package com.project.Order.dto;

public class CartDTO {
	
	int buyerid;
	int prodid;
	Integer quantity;
	
	public CartDTO() {
		super();
	}
	
	public CartDTO(int buyerid ,int prodid ,Integer quantity) {
		this.buyerid=buyerid;
		this.prodid=prodid;
		this.quantity=quantity;
	}

	public int getBuyerid() {
		return buyerid;
	}

	public void setBuyerid(int buyerid) {
		this.buyerid = buyerid;
	}

	public int getProdid() {
		return prodid;
	}

	public void setProdid(int prodid) {
		this.prodid = prodid;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}



	@Override
	public String toString() {
		return "CartDTO [buyerid=" + buyerid + ", prodid=" + prodid + ", quantity=" + quantity + "]";
	}

}
