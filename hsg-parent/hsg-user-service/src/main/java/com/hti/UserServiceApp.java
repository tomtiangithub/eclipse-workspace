package com.hti;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserServiceApp {
	public static void main(String[] args) {
		new SpringApplicationBuilder(UserServiceApp.class).run(args);
	}
}
