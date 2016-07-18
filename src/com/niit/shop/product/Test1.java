package com.niit.shop.product;

import java.util.*;

public class Test1 {


		public static void main(String[] args) {
			// create instance or object
			// class name object name= new constructorname();
			
		
	    Product product = new Product();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your id:");
	 String id=sc.next();
	    
	    product.setId(id);
	    System.out.println("Enter name:");
	    String name=sc.next();
	    product.setName(name);

	    System.out.println("Enter price:");
	    double price=sc.nextDouble();
	    product.setPrice(price);
		
		
	    System.out.println("Product Id:"+product.getId());
	    System.out.println(product.getName());
	    System.out.println(product.getPrice());

	}

}
