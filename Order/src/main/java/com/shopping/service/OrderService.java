package com.shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.model.OrderModel;
import com.shopping.repository.OrderRepo;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepo orderRepo;
	
    // Creating or Adding Order
	public OrderModel addOrder(OrderModel order) {
		return orderRepo.save(order);	
	}
	
	public List <OrderModel> getOrders() {
		List<OrderModel> order= orderRepo.findAll();
		System.out.println("Getting order from DB" + order);
		return order;	
	}

	public void deleteById(int id) {
		orderRepo.deleteById(id);	
	}

}
