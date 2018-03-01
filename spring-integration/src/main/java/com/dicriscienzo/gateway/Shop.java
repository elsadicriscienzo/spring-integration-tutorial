package com.dicriscienzo.gateway;

import org.springframework.integration.annotation.Gateway;

import com.dicriscienzo.model.Order;

public interface Shop {

@Gateway(requestChannel="ordersChannel")
void placeOrder(Order order);

}

