package com.shopping.models;

public class Items {
	
	private String pName;
	private double price;
	private int quantity;
	
	
	//default constructor
	public Items() {
		
	}
	
	//to string
	@Override
	public String toString() {
		return "Items [pName=" + pName + ", price=" + price + ", quantity=" + quantity + "]";
	}



	//parametrized constructor
	public Items(String pName, double price, int quantity) {
		super();
		this.pName = pName;
		this.price = price;
		this.quantity = quantity;
	}

	//Getter and setter
	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
