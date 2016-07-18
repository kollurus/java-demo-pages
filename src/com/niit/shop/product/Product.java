package com.niit.shop.product;

public class Product {

	private String id;
	private String name;
	private double price;
	 
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price>0)
{
		this.price = price;
	}
		else{
   System.out.println("invalid price");
   this.price = 5000;
		}
		}
	
}

	

