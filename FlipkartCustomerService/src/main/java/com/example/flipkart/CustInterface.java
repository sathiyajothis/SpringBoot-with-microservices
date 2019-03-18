package com.example.flipkart;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value="SUPERMARKET")
public interface CustInterface 
{	
	@GetMapping("/order/{orderId}")
	public Orders getMyDetails(@PathVariable("orderId") int orderId);
}
