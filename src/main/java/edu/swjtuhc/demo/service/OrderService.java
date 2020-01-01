package edu.swjtuhc.demo.service;

import java.util.List;

import edu.swjtuhc.demo.model.Order;

public interface OrderService {
	public int addOrder(Order order);
	public int delOrder(Order order);
	public List<Order> getOrderList();	
}
