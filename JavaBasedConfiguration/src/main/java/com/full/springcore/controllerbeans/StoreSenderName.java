package com.full.springcore.controllerbeans;

import java.util.ArrayList;
import java.util.List;

public class StoreSenderName {

	private List<String> names = new ArrayList<>();

	public StoreSenderName() {

		System.out.println("constructor called store messenger");

	}

	public void storeSenderNames(String fromReceiptant) {

		names.add(fromReceiptant);
	}

	public void printName() {

		names.forEach(System.out::println);

	}

}
