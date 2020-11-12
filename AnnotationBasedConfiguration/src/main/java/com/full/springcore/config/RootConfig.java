package com.full.springcore.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.full.springcore.controllerbeans", "com.full.springcore.servicebeans" })
public class RootConfig {

}
