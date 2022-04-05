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

import com.rest.springREST.main.Order;
import com.rest.springREST.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	private OrderService orderservice;
	
	@PostMapping("/orders")
	public Order addOrder(@RequestBody Order order) {
		return this.orderservice.addOrder(order);
	}
	
	@PutMapping("/orders")
	public Order updateOrder(@RequestBody Order order) {
		return this.orderservice.updateOrder(order);
	}
	
	@GetMapping("/orders/{orderId}")
	public Order viewOrder(@PathVariable String orderId) {
		return this.orderservice.viewOrder(Integer.parseInt(orderId));
	}
	
	@GetMapping("/orders")
	public List<Order> viewAllOrders(){
		
		return this.orderservice.viewAllOrders();
	}
	
		
	@DeleteMapping("/orders/{orderId}")
	public ResponseEntity<HttpStatus> deleteOrder(@PathVariable String orderId) {
		try {
			this.orderservice.deleteOrder(Long.parseLong(orderId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
