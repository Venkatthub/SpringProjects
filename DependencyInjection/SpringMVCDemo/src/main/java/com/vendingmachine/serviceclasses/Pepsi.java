package com.vendingmachine.serviceclasses;

import org.springframework.stereotype.Component;

@Component
public class Pepsi extends Beverages {

	public Pepsi() {
		super("PEPSI", 30.55);
	}

}
