package com.rest.springREST.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.rest.springREST.main.Order;

@Service
public class OrderServiceimpl implements OrderService {

	List<Order>list;
	public OrderServiceimpl() {
		list=new ArrayList<>();
		list.add(new Order(1,"Mobile"));
		list.add(new Order(2,"Laptop"));
		list.add(new Order(3,"Headphone"));
	}
	@Override
	public Order addOrder(Order order) {
		list.add(order);
		return order;
	}

	@Override
	public Order updateOrder(Order order) {
		for(Order o:list) {
			if(o.getOrderId()==order.getOrderId()) {
				o.setOrderId(order.getOrderId());
				o.setOrderName(order.getOrderName());
			}
		}
		return order;
	}

	@Override
	public Order viewOrder(long orderId) {
		Order o=null;
		for(Order order:list) {
			if(order.getOrderId()==orderId) {
				o=order;
				break;
			}
		}
		return o;
	}

	@Override
	public List<Order> viewAllOrders() {
		return list;
	}

	@Override
	public void deleteOrder(long parselong) {
		list=this.list.stream().filter(o->o.getOrderId()!=parselong).collect(Collectors.toList());
		
	}

}
