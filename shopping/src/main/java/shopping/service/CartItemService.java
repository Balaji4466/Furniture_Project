package shopping.service;

import java.util.List;

import shopping.model.CartItem;

public interface CartItemService {

	public void addCart(CartItem cartItem);
	public void removeCart(Integer cartid);
	public void removeAllCart(List<CartItem> cartItems);
	public CartItem getcartitem(Integer Ciid);
	public List<CartItem> list();
}
