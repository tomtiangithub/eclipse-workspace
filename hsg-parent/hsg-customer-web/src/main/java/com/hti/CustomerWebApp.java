package com.hti;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CustomerWebApp {
	public static void main(String[] args) {
		new SpringApplicationBuilder(CustomerWebApp.class).run(args);
	}
}
