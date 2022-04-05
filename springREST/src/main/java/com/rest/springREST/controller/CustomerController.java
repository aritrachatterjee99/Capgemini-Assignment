package com.rest.springREST.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.springREST.main.Customer;
import com.rest.springREST.service.CustomerService;


@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerservice;
	
	@PostMapping("/customer")
	public Customer addCustomer(@RequestBody Customer customer) {
		return this.customerservice.addCustomer(customer);
	}
	
	@PutMapping("/customer")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return this.customerservice.updateCustomer(customer);
	}
	
	@DeleteMapping("/customer/{customerId}")
	public ResponseEntity<HttpStatus> deleteCustomer(@PathVariable String customerId) {
		try {
			this.customerservice.deleteCustomer(Long.parseLong(customerId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/customer/{customerId}")
	public Customer fetchCustomer(@PathVariable String customerId) {
		return this.customerservice.fetchCustomer(Long.parseLong(customerId));
	}
	
	@GetMapping("/customer")
	public List<Customer> viewAllCustomer(){
		
		return this.customerservice.viewAllCustomer();
	}
	

}
