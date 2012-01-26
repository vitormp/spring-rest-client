package com.vitormp.rest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import com.vitormp.model.Customer;

@Controller
public class CustomerService {
	
	private static final Logger LOGGER = Logger.getLogger(CustomerService.class);

	@Autowired
	private RestClient restClient;
	
	@RequestMapping(value="/customer", method=RequestMethod.GET)
	@ResponseStatus(value=HttpStatus.OK)
	public ModelAndView getCustomerData(){
		LOGGER.info("Request to customer rest client.");
		Customer customer = restClient.getCustomerData();
		LOGGER.info("Customer retreived: " + customer.getName());
		return new ModelAndView("viewResolver", "customer", customer);
	}
}
