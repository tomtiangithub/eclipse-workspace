package com.hti;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class HsgGatewayApp {

	public static void main(String[] args) {
		new SpringApplicationBuilder(HsgGatewayApp.class).run(args);
	}
}
