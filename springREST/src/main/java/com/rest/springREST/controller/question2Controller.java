package com.rest.springREST.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rest.springREST.main.logindetails;

@RestController
public class question2Controller {
    @RequestMapping(value="/question2/{user}",method=RequestMethod.PUT)
    public String checkcredentials(@PathVariable("user") String username, @RequestBody logindetails login) {
    	if(login.username=="Aritra" && login.password=="abcd")
    		return "Valid User";
    	else
    		return "Invalid User";
			
	}

}
