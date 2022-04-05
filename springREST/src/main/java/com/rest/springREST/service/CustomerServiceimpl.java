package com.rest.springREST.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.rest.springREST.main.Customer;

@Service
public class CustomerServiceimpl implements CustomerService {
	
	List<Customer>list;
	public CustomerServiceimpl() {
		list=new ArrayList<>();
		list.add(new Customer(1,"John"));
		list.add(new Customer(2,"Mike"));
	}
	@Override
	public Customer addCustomer(Customer customer) {
		list.add(customer);
		return customer;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		for(Customer c:list) {
			if(c.getCustomerId()==customer.getCustomerId()) {
				c.setCustomerName(customer.getCustomerName());
			}
		}
		return customer;
	}
	
	@Override
	public void deleteCustomer(long parselong) {
		list=this.list.stream().filter(c->c.getCustomerId()!=parselong).collect(Collectors.toList());
		
	}

	@Override
	public Customer fetchCustomer(long customerId) {
		Customer c=null;
		for(Customer customer:list) {
			if(customer.getCustomerId()==customerId) {
				c=customer;
				break;
			}
		}
		return c;
	}

	@Override
	public List<Customer> viewAllCustomer() {
		return list;
	}


}
