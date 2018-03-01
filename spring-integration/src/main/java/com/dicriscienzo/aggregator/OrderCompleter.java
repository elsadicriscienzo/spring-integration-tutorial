package com.dicriscienzo.aggregator;

import java.util.List;

import com.dicriscienzo.model.Order;
import com.dicriscienzo.model.OrderItem;

public class OrderCompleter {

	  public Order prepareDelivery(List<OrderItem> orderItems) {
	         final Order order = new Order();
	         order.setOrderItems(orderItems);  
	         return order;
	  }
	}
