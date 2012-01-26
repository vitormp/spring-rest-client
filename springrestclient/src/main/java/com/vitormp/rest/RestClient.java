package com.vitormp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.vitormp.model.Customer;

@Component("restClient")
public class RestClient {

	@Autowired
	private RestTemplate restTemplate;
	
	public RestClient(){}
	
	public RestClient(RestTemplate restTemplate){
		this.restTemplate = restTemplate;
	}
	
	public Customer getCustomerData(){
//		RestTemplate restTemplate = new RestTemplate();
		Customer customer = restTemplate.getForObject("http://localhost:8080/springrest/resource/customer/name", Customer.class);
		return customer;
	}
}
