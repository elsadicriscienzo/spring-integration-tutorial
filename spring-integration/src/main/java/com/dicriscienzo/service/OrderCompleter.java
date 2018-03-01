package com.dicriscienzo.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dicriscienzo.model.Order;
import com.dicriscienzo.model.OrderItem;

public class OrderCompleter {
	
	private static final Logger log = LoggerFactory.getLogger(OrderCompleter.class);

	public Order prepareDelivery(List<OrderItem> orderItems) {
		final Order order = new Order();
		order.setOrderItems(orderItems);
		

		log.debug("*** [OrderCompleter] CompletedOrder Discounted cost: "
		+ order.getTotalDiscountedCost() +" ****");

		return order;
	}
}
