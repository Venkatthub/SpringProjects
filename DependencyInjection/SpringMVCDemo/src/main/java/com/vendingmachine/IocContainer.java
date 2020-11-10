package com.vendingmachine;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.vendingmachine.consumers.ServiceConsumer;
import com.vendingmachine.serviceclasses.Beverages;
import com.vendingmachine.serviceclasses.Coke;
import com.vendingmachine.serviceclasses.Pepsi;
import com.vendingmachine.serviceclasses.Soda;

@Configuration
@ComponentScan({ "com.vandingmachine", "com.vandingmachine.consumers", "com.vandingmachine.serviceclasses" })
public class IocContainer {

	@Bean
	public Beverages getCoke() {
		return new Coke();
	}

	@Bean
	public Beverages getPepsi() {
		return new Pepsi();
	}

	@Bean
	public Beverages getSoda() {
		return new Soda();
	}

	@Bean("coke")
	public ServiceConsumer getCokeService() {

		return new ServiceConsumer(getCoke());
	}

	@Bean("pepsi")
	public ServiceConsumer getPepsiService() {

		return new ServiceConsumer(getPepsi());
	}

	@Bean("soda")
	public ServiceConsumer getSodaService() {

		return new ServiceConsumer(getSoda());
	}

}
