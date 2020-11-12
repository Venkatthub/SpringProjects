package com.full.springcore.controllerbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.full.springcore.servicebeans.Service;

@Component("messenger")
public class Messenger {

	private String fromReceiptent;
	private String[] toReceiptants;
	private Service mailing;
	private StoreSenderName storeSenders;

	// Have to use setter injection when two classes depend on each other
	// else it will cause circular dependency problem
	@Autowired
	public void setStoreSenders(StoreSenderName storeSenders) {

		System.out.println("Setter injection");

		this.storeSenders = storeSenders;

	}

	@Autowired
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
