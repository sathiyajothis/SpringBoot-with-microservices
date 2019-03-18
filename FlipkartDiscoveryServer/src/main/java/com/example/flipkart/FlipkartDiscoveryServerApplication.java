package com.example.flipkart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FlipkartDiscoveryServerApplication {

	public static void main(String[] args) {		
		SpringApplication.run(FlipkartDiscoveryServerApplication.class, args);
		System.out.println("Entered into FlipkartDiscoveryServerApplication");
	}

}
