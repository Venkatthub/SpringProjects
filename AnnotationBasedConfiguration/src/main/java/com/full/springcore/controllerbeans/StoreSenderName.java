package com.full.springcore.controllerbeans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("storage")
public class StoreSenderName {

	private List<String> names = new ArrayList<>();

	@Autowired
	Messenger messenger;

	public StoreSenderName() {

		System.out.println("constructor called store messenger");

	}

	public void storeSenderNames(String fromReceiptant) {

		names.add(messenger.getFromName());
	}

	public void printName() {

		names.forEach(System.out::println);

	}

}
