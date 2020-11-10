package com.vendingmachine.serviceclasses;

import org.springframework.stereotype.Component;

@Component
public class Coke extends Beverages {

	public Coke() {
		super("COKE", 45.5);
	}

}
