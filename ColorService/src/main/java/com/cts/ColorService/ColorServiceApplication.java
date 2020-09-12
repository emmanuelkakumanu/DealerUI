package com.cts.ColorService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EntityScan(basePackages = "com.cts.*")
public class ColorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ColorServiceApplication.class, args);
	}

}
