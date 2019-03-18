package com.example.flipkart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class FlipkartOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlipkartOrderServiceApplication.class, args);
	}

	@Bean
	public OrderService getDet()
	{
		return new OrderService();
	}
}
