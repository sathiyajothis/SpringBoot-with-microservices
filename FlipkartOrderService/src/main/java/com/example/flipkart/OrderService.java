package com.example.flipkart;

import java.util.*;

public class OrderService 
{
	static List<Orders> li=new ArrayList<>();
	
	public OrderService()
	{
		Orders order1=new Orders(101,"watch",1000);
		Orders order2=new Orders(102,"Ring",2000);
		Orders order3=new Orders(103,"Head phone",1000);
		Orders order4=new Orders(104,"TV",10000);
		Orders order5=new Orders(105,"Charger",100);
		
		li.add(order1);
		li.add(order2);
		li.add(order3);
		li.add(order4);
		li.add(order5);
	}
	
	public Orders getDetails(int orderId)
	{
		Orders ord=null;
		
		for(Orders ord1:li)
		{
			if(ord1.getOrderID()==orderId)
			{
				ord=ord1;
			}
		}
		return ord;
	}
}
