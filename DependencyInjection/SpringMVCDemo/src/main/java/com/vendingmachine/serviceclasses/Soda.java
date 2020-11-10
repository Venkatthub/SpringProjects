package com.vendingmachine.serviceclasses;

import org.springframework.stereotype.Component;

@Component
public class Soda extends Beverages {

	public Soda() {
		super("SODA", 15.25);
	}

}
