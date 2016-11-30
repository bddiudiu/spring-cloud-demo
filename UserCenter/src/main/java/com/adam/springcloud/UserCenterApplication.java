package com.adam.springcloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class UserCenterApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(UserCenterApplication.class).web(true).run(args);
	}
}
