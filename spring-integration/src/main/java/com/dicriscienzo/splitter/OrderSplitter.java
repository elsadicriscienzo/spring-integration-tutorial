package com.dicriscienzo.splitter;

import com.dicriscienzo.model.Order;

public class OrderSplitter{

	 public Object splitMessage(Order message) { 
	  return message.getOrderItems();
	 }

	}
