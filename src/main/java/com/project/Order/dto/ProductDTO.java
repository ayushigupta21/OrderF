package com.project.Order.dto;

public class ProductDTO {
	
	int prodid;
	String brand;
	String category;
	String description;
	String image;
	double price;
	String productname;
	String rating;
	int sellerid;
	int stock;
	String subcategory;
	
	//parameterless constructor
	public ProductDTO() {
		super();
	}
		
		//parameterized constructor
	public ProductDTO(int prodid, String brand, String category, String description, String image, double price,
				String productname, String rating, int sellerid, int stock, String subcategory) {
		super();
		this.prodid = prodid;
		this.brand = brand;
		this.category = category;
		this.description = description;
		this.image = image;
		this.price = price;
		this.productname = productname;
		this.rating = rating;
		this.sellerid = sellerid;
		this.stock = stock;
		this.subcategory = subcategory;
	}	
	
	//getters and setters 
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public int getSellerid() {
		return sellerid;
	}
	public void setSellerid(int sellerid) {
		this.sellerid = sellerid;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getSubcategory() {
		return subcategory;
	}
	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}
	
	

	@Override
	public String toString() {
		return "ProductDTO [prodid=" + prodid + ", brand=" + brand + ", category=" + category + ", description="
				+ description + ", image=" + image + ", price=" + price + ", productname=" + productname + ", rating="
				+ rating + ", sellerid=" + sellerid + ", stock=" + stock + ", subcategory=" + subcategory + "]";
	}	

}
