package com.niit.shop.product;

public class test  {


	public static void main(String[] args) {
		// create instance or object
		// class name object name= new constructorname();
	
    Product product = new Product();
    product.setId("007");
    product.setName("mac");
    product.setPrice(-15000);
	
	
    System.out.println( product.getId());
    System.out.println(product.getName());
    System.out.println(product.getPrice());

	}
}
    