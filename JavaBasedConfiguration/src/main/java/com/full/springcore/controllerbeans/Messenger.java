package com.full.springcore.controllerbeans;

import com.full.springcore.servicebeans.Service;

public class Messenger {

	private String fromReceiptent;
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

	public String getFromReceiptent() {

		return fromReceiptent;

	}

	public void setFromReceiptent(String fromReceiptent) {

		this.fromReceiptent = fromReceiptent;

		storeSenders.storeSenderNames(fromReceiptent);

	}

	public String[] getToReceiptants() {

		return toReceiptants;

	}

	public void setToReceiptants(String[] toReceiptants) {

		this.toReceiptants = toReceiptants;

	}

	public void sendMessage(String message) {

		mailing.sendMessage(fromReceiptent, toReceiptants, message);

	}

}
