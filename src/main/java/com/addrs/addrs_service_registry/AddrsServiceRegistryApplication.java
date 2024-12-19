package com.addrs.addrs_service_registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AddrsServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddrsServiceRegistryApplication.class, args);
	}

}
