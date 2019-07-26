package com.hti;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CustomerServiceApp {

	public static void main(String[] args) {
		new SpringApplicationBuilder(CustomerServiceApp.class).run(args);
	}

}