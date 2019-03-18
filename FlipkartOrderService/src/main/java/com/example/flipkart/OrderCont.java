package com.example.flipkart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderCont 
{
	@Autowired
	OrderService os;
	
	@GetMapping("/order/{orderId}")
	public Orders getMyDetails(@PathVariable("orderId") int orderId)
	{
		Orders ord=os.getDetails(orderId);
		return ord;
	}
}
