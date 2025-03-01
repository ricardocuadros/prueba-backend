package com.zosh.service;

import com.zosh.exception.ProductException;
import com.zosh.model.Cart;
import com.zosh.model.User;
import com.zosh.request.AddItemRequest;

public interface CartService {

	public Cart createCart(User user);
	
	public String addCartItem(Long userId, AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);
	
}
