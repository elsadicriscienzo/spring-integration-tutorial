package com.dicriscienzo.onlineshop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dicriscienzo.gateway.Shop;
import com.dicriscienzo.model.Book;
import com.dicriscienzo.model.MusicCD;
import com.dicriscienzo.model.Order;
import com.dicriscienzo.model.OrderItem;
import com.dicriscienzo.model.Software;


public class OnlineShop {
	
	
	private static final Logger log = LoggerFactory.getLogger(OnlineShop.class);

	 public static void main(String[] args) {

	  AbstractApplicationContext context =
	   new ClassPathXmlApplicationContext("/META-INF/shop.xml", OnlineShop.class);

	  Shop shop = (Shop) context.getBean("shop");

	  final Order order = createOrder();

	  shop.placeOrder(order);

	  context.close();
	 }
	 
	 private static Order createOrder() {
			Book book = new Book("Of Mice & Men", "Bluebird", new BigDecimal("100"), 1988, "John Steinbeck");
			MusicCD cd = new MusicCD("Off the Wall", "publisher", new BigDecimal("100"), 1975, "Michael Jackson");
			Software macos = new Software("Mavericks", "publisher", new BigDecimal("100"), 2014, "10.9.3");
			
			OrderItem bookItems = new OrderItem(book);
//			bookItems.incrementQuantity();
			
			OrderItem cdItems = new OrderItem(cd);
//			cdItems.incrementQuantity();
//			cdItems.incrementQuantity();
			
			OrderItem swItems = new OrderItem(macos);
			
			final List<OrderItem> orderItems = new ArrayList<OrderItem>();
			orderItems.add(bookItems);
			orderItems.add(cdItems);
			orderItems.add(swItems);
			
			Order order = new Order();
			order.setOrderItems(orderItems);
			log.debug("Order: " + order);
//			log.debug("Total : "+ order.getTotalCost());

			return order;
		}
	 
}
