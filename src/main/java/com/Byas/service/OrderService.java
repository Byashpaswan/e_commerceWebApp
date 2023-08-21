package com.Byas.service;

import java.util.List;

import com.Byas.exception.OrderException;
import com.Byas.model.Address;
import com.Byas.model.Order;
import com.Byas.model.User;

public interface OrderService {

	public Order createOrder(User user, Address shippingAdress);
	
	public Order findOrderById(Long orderId) throws OrderException;
	
	public List<Order> usersOrderHistory(Long userId);
	
	public Order placedOrder(Long orderId) throws OrderException;
	
	public Order confirmedOrder(Long orderId)throws OrderException;
	
	public Order shippedOrder(Long orderId) throws OrderException;
	
	public Order deliveredOrder(Long orderId) throws OrderException;
	
	public Order cancledOrder(Long orderId) throws OrderException;
	
	public List<Order>getAllOrders();
	
	public void deleteOrder(Long orderId) throws OrderException;

}
