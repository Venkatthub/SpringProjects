package com.vendingmachine;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.vendingmachine.consumers.ServiceConsumer;
import com.vendingmachine.serviceclasses.Coke;
import com.vendingmachine.serviceclasses.Pepsi;
import com.vendingmachine.serviceclasses.Soda;

@Configuration
@ComponentScan({ "com.vandingmachine", "com.vandingmachine.consumers", "com.vandingmachine.serviceclasses" })
public class IocContainer {

	@Bean("coke")
	public ServiceConsumer getCokeService() {

		return new ServiceConsumer(new Coke());
	}

	@Bean("pepsi")
	public ServiceConsumer getPepsiService() {

		return new ServiceConsumer(new Pepsi());
	}

	@Bean("soda")
	public ServiceConsumer getSodaService() {

		return new ServiceConsumer(new Soda());
	}

}
