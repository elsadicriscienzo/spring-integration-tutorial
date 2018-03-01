package com.dicriscienzo.router;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dicriscienzo.model.Book;
import com.dicriscienzo.model.MusicCD;
import com.dicriscienzo.model.OrderItem;
import com.dicriscienzo.model.Software;

public class OrderItemRouter {

	private static final Logger log = LoggerFactory.getLogger(OrderItemRouter.class);

	public String routeOrder(OrderItem orderItem) {
		
		log.debug("*** [OrderItemRouter] ****");

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

		log.debug("*** [OrderItemRouter] sending item : " + orderItem.getItem().getTitle() + " to "+ channel +  " ****");

		return channel;
   }
	
	private Boolean isBook(OrderItem orderItem) {
		return orderItem.getItem() instanceof Book;			
	}
	private Boolean isMusic(OrderItem orderItem) {
		return orderItem.getItem() instanceof MusicCD;			
	}
	private Boolean isSoftware(OrderItem orderItem) {
		return orderItem.getItem() instanceof Software;			
	}
}

