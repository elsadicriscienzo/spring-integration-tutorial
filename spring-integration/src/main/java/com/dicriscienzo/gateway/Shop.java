package com.dicriscienzo.gateway;

import com.dicriscienzo.model.Order;

public interface Shop {

//@Gateway(requestChannel="ordersChannel")
void placeOrder(Order order);

}

