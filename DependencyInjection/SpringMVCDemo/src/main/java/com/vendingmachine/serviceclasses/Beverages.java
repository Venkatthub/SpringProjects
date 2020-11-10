package com.vendingmachine.serviceclasses;

public abstract class Beverages {

	private String name;
	private double price;

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public Beverages(String name, double price) {
		this.name = name;
		this.price = price;
	}

}
