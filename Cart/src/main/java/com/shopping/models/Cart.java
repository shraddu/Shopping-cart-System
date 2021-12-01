package com.shopping.models;

public class Cart {
	
	private int cartId;
	private double totalPrice;
	
	//default constructor
	public Cart() {
		
	}
	
	//to string
	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", totalPrice=" + totalPrice + "]";
	}

	//parametrized constructor
	public Cart(int cartId, double totalPrice) {
		super();
		this.cartId = cartId;
		this.totalPrice = totalPrice;
	}

	//Getter and setter
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	

}
