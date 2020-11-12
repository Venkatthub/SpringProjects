package com.full.springcore.servicebeans;

import java.util.Arrays;

public class WhatsApp implements Service {

	private static final String SERVICE_NAME = "WhatsApp";

	public WhatsApp() {

		System.out.println("Constructor called whatsapp");

	}

	@Override
	public void sendMessage(String sender, String[] receivers, String message) {

		System.out.println("From :" + sender);
		System.out.println("To :" + Arrays.toString(receivers));
		System.out.println("Message :" + message);
		System.out.println("Message sent through :" + SERVICE_NAME);

	}

}
