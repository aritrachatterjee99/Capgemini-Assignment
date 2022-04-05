package com.rest.springREST.service;

import java.util.List;

import com.rest.springREST.main.Order;

public interface OrderService {
	
	public Order addOrder(Order order);
	
	public Order updateOrder(Order order);
	
	public Order viewOrder(long orderId);
	
	public List<Order> viewAllOrders();
	
	public void deleteOrder(long parselong);

}
