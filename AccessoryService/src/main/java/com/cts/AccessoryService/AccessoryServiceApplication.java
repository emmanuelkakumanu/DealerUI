package com.cts.AccessoryService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EntityScan(basePackages = "com.cts.*")
public class AccessoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccessoryServiceApplication.class, args);
	}

}
