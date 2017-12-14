package shopping.dao;

import java.util.List;
import shopping.model.CartItem;

public interface CartItemDAO {

	public void addCart(CartItem cartItem);
	public void removeCart(Integer Ciid);
	public void removeAllCart(List<CartItem> cartItems);
	public CartItem getcartitem(Integer Ciid);
	public List<CartItem> list();
}
