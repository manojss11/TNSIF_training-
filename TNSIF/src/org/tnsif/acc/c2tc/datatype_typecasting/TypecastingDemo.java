package org.tnsif.acc.c2tc.datatype_typecasting;

public class TypecastingDemo {

	public static void main(String[] args) {
		
		double priceperItem=99.90;
		int quantity=3;
		double totalprice=quantity*priceperItem;
		
		double discount=10.33;
		int roundedDiscount=(int)discount;
		
		double finalAmount=totalprice-roundedDiscount;
		
		System.out.println("online shopping summary");
		System.out.println("items bought:"+quantity);
		System.out.println("price per item:"+priceperItem);
		System.out.println("final amount to pay after discount:"+finalAmount);

	}

}
