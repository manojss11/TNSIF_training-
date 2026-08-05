package org.tnsif.acc.c2tc.datatype_typecasting;

public class foodOrder {

	private static String I;

	public static void main(String[] args) {
		int orderId=101;
		double price=299.90;
		boolean isDelivered=false;
		char rating='A';
		float DeliveryDistance=5.3f;
		long DeliveryBoyPhone =8978654578L;
		byte DeliveryTime=45;
		short resturantId=12;
		
		String CustomerName="satish";
		String[]fooditem= {"burger","rice","coke"};
		System.out.println("Order summary");
		System.out.println("Customer Name :"+CustomerName);
		System.out.println("order Id:"+orderId);
		System.out.println("resturantId:"+resturantId);
		System.out.println("DeliveryBoyContact:"+DeliveryBoyPhone);
		System.out.println("food items:");
		for(String item:fooditem)
		{
			System.out.println("-"+ item);
			System.out.println("total price:"+price);
			System.out.println("Deliverydistance:"+DeliveryDistance);
			System.out.println("expected time:"+DeliveryTime);
			System.out.println("delivery status:"+isDelivered);
			System.out.println("rating:"+rating);
		

		}

	}
}