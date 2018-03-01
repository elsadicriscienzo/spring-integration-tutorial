package com.dicriscienzo.service;

import java.math.BigDecimal;

import com.dicriscienzo.model.OrderItem;

public class Shopkeeper {

	 private static final BigDecimal BOOK_DISCOUNT = new BigDecimal(0.05);
	 private static final BigDecimal MUSIC_DISCOUNT = new BigDecimal(0.10);
	 private static final BigDecimal SOFTWARE_DISCOUNT = new BigDecimal(0.15);

	 /**
	  * Performs discount on books
	  * @param bookOrderItem OrderItem comprising of a book item
	  * @return OrderItem with discount price newly calculated
	  */
	 public OrderItem processBooks(OrderItem bookOrderItem){  

	  final BigDecimal finalPrice = calculateDiscountedPrice(bookOrderItem, BOOK_DISCOUNT);

	  bookOrderItem.setDiscountedPrice(finalPrice);

	  return bookOrderItem;
	 }

	/**
	  * Performs discount on music
	  * @param musicOrderItem OrderItem comprising of a music item
	  * @return OrderItem with discount price newly calculated
	  */
	 public  OrderItem processMusic(OrderItem musicOrderItem){  

	  final BigDecimal finalPrice = calculateDiscountedPrice(musicOrderItem, MUSIC_DISCOUNT);

	  musicOrderItem.setDiscountedPrice(finalPrice);

	  return musicOrderItem;
	 }

	 /**
	  * Performs discount on software
	  * @param softwareOrderItem OrderItem comprising of a book item
	  * @return OrderItem with discount price newly calculated
	  */
	 public  OrderItem processSoftware(OrderItem softwareOrderItem){  

	  final BigDecimal finalPrice = calculateDiscountedPrice(softwareOrderItem, SOFTWARE_DISCOUNT);

	  softwareOrderItem.setDiscountedPrice(finalPrice);

	  return softwareOrderItem;
	 }
	 

	 private BigDecimal calculateDiscountedPrice(OrderItem bookOrderItem, BigDecimal bookDiscount) {
		// TODO Auto-generated method stub
		return null;
	}

}
