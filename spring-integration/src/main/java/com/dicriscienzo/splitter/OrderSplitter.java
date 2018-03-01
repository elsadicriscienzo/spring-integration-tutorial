package com.dicriscienzo.splitter;

import com.dicriscienzo.model.Order;

public class OrderSplitter extends AbstractMessageSplitter{

	 @Override
	 protected Object splitMessage(Message message) { 
	  return ((Order)message.getPayload()).getOrderItems();
	 }

	}
