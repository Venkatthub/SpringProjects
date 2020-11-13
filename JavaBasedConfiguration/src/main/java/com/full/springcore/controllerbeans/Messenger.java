package com.full.springcore.controllerbeans;

import com.full.springcore.servicebeans.Service;

public class Messenger {

	private String fromName;
	private String[] toReceiptants;
	private Service mailing;
	private StoreSenderName storeSenders;

	public void setStoreSenders(StoreSenderName storeSenders) {

		System.out.println("Setter injection");

		this.storeSenders = storeSenders;

	}

	public Messenger(Service mailing) {

		System.out.println("constructor injection");

		this.mailing = mailing;

	}

	public String getFromName() {

		return fromName;

	}

	public void setFromName(String fromName) {

		this.fromName = fromName;

		storeSenders.storeSenderNames(fromName);

	}

	public String[] getToReceiptants() {

		return toReceiptants;

	}

	public void setToReceiptants(String[] toReceiptants) {

		this.toReceiptants = toReceiptants;

	}

	public void sendMessage(String message) {

		mailing.sendMessage(fromName, toReceiptants, message);

	}

}
