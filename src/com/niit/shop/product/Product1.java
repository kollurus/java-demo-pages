package com.niit.shop.product;

public class Product1 {

	private double id;
	private String name;
	private double price;
	 
	
	public double getId() {
		//string cant be used;
		return id;
	}
	public void setId(double id) {
		if((id<100)&&(id>0))
		{
			System.out.println("valid id");
			this.id = id;
		}
		else{
			System.out.println("invalid id");
		}
		
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
