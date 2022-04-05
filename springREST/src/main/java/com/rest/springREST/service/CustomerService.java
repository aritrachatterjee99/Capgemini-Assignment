package com.rest.springREST.service;

import java.util.List;

import com.rest.springREST.main.Customer;

public interface CustomerService {
	
	public Customer addCustomer(Customer customer);
	
	public Customer updateCustomer(Customer customer);
	
	public void deleteCustomer(long parselong);
	
	public Customer fetchCustomer(long customerId);
	
	public List<Customer> viewAllCustomer();
	
	

}
