package com.rest.springREST.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.springREST.main.address;

@RestController
public class question3Controller {
	@RequestMapping("/zipcode:99501")
	public List<address> getAddresses(){
	    List<address> addresses=new ArrayList<>();
	    address a1=new address();
	    a1.setState("AK");
	    a1.setCity("ANCHORAGE");
	    a1.setCountry("US");
	    
	    addresses.add(a1);
	    return addresses;
		
	}

}
