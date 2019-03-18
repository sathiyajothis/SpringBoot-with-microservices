package com.example.flipkart;

public class Orders 
{
	private int orderID;
	private String orderName;
	private float orderPrice;
	
	public Orders()
	{
		
	}
	public Orders(int orderID, String orderName, float orderPrice) {
		super();
		this.orderID = orderID;
		this.orderName = orderName;
		this.orderPrice = orderPrice;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public float getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(float orderPrice) {
		this.orderPrice = orderPrice;
	}	
}
