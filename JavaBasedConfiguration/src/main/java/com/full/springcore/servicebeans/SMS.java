package com.full.springcore.servicebeans;

import java.util.Arrays;

public class SMS implements Service {

	private static final String SERVICE_NAME = "SMS";
	private int messageBalance = 100;

	public SMS() {
		System.out.println("Constructor called SMS");
	}

	@Override
	public void sendMessage(String sender, String[] receivers, String message) {

		if (messageBalance != 0) {

			messageBalance--;
			System.out.println("From :" + sender);
			System.out.println("To :" + Arrays.toString(receivers));
			System.out.println("Message :" + message);
			System.out.println("Message sent through :" + SERVICE_NAME);
			System.out.println("you have remaining :" + messageBalance + " messages.");

		} else {

			System.out.println(
					"You dont have message balance to send messages hereafter, Please recharge immediately to enjoy uninterrupted services.");

		}
	}

}
