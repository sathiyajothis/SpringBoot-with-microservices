package com.example.flipkart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CustController 
{
	/*
	 * @Autowired RestTemplate rt;
	 */
	
	@Autowired
	CustInterface ci;
	
	@GetMapping("/cust/{orderId1}")
	public Orders getOrderDetails(@PathVariable("orderId1") int orderId1)
	{
		/*
		 * ResponseEntity<Orders> re=rt.exchange("http://SUPERMARKET/order/{orderId}",
		 * HttpMethod.GET,null,new ParameterizedTypeReference<Orders>() { }, orderId1);
		 * return re.getBody();
		 */		
		return ci.getMyDetails(orderId1);
	}
}
