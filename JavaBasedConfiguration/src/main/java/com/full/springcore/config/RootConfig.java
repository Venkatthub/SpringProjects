package com.full.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.full.springcore.controllerbeans.Messenger;
import com.full.springcore.controllerbeans.StoreSenderName;
import com.full.springcore.servicebeans.Email;
import com.full.springcore.servicebeans.SMS;
import com.full.springcore.servicebeans.Service;
import com.full.springcore.servicebeans.WhatsApp;

@Configuration
public class RootConfig {

	@Bean("email")
	public Service getEmailService() {

		return new Email();

	}

	@Bean("sms")
	public Service getSmsService() {

		return new SMS();

	}

	@Bean("whatsapp")
	public Service getWhatsAppService() {

		return new WhatsApp();

	}

	@Bean("messanger")
	public Messenger getMessanger() {

		return new Messenger(getSmsService());

	}

	@Bean
	public void setStoreSenders() {

		getMessanger().setStoreSenders(storeName());

	}

	@Bean("storage")
	public StoreSenderName storeName() {

		return new StoreSenderName();

	}

}
