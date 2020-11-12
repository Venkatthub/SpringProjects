package com.full.springcore.servicebeans;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component("email")
public class Email implements Service {

	private static final String SERVICE_NAME = "EMail";

	public Email() {
		System.out.println("Constructor called EMail");
	}

	@Override
	public void sendMessage(String sender, String[] receivers, String message) {

		System.out.println("From :" + sender);
		System.out.println("To :" + Arrays.toString(receivers));
		System.out.println("Message :" + message);
		System.out.println("Message sent through :" + SERVICE_NAME);

	}

}
