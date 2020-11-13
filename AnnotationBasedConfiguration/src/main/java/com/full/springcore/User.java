package com.full.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.full.springcore.config.RootConfig;
import com.full.springcore.controllerbeans.Messenger;
import com.full.springcore.controllerbeans.StoreSenderName;

public class User {

	private static Messenger messenger;
	private static StoreSenderName senderName;

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(RootConfig.class);

		messenger = (Messenger) context.getBean("messenger");

		messenger.setFromName("venkat");

		messenger.setToReceiptants(new String[] { "akash", "francis" });

		messenger.sendMessage("Hi, Good morning. Have a good day !");

		senderName = (StoreSenderName) context.getBean("storage");

		System.out.print("your message has been sent ");

		senderName.printName();

	}

}
