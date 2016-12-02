package com.adam.springcloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigCenterApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ConfigCenterApplication.class).web(true).run(args);
	}
}
