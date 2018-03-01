package com.dicriscienzo.router;

import com.dicriscienzo.model.OrderItem;

public class OrderItemRouter {

	 public String routeOrder(OrderItem orderItem) {

	  String channel = "";
	  if(isBook(orderItem)) {
	   channel = "bookItemsChannel";
	  }
	  else if(isMusic(orderItem)) {
	   channel = "musicItemsChannel";
	  }
	  else if(isSoftware(orderItem)) {
	   channel = "softwareItemsChannel";
	  }

	  return channel;
	  }

	private boolean isSoftware(OrderItem orderItem) {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean isMusic(OrderItem orderItem) {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean isBook(OrderItem orderItem) {
		// TODO Auto-generated method stub
		return false;
	}
}

