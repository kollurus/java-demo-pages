package com.niit.shop.product;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
	 // create instance or object
		// class name object name= new constructorname();
		
		  Product1 product = new Product1();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your id:");
			 double id=sc.nextDouble();
			    
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
