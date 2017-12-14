package shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import shopping.dao.CartItemDAO;
import shopping.model.CartItem;

public class CartItemServiceImp implements CartItemService {

	@Autowired
	private CartItemDAO cartItemDAO; 
	@Override
	public void addCart(CartItem cartItem) {
		// TODO Auto-generated method stub
		cartItemDAO.addCart(cartItem);
	}

	@Override
	public void removeCart(Integer cartid) {
		// TODO Auto-generated method stub
		cartItemDAO.removeCart(cartid);
	}

	@Override
	public List<CartItem> list() {
		// TODO Auto-generated method stub
		return cartItemDAO.list();
	}

	@Override
	public CartItem getcartitem(Integer Ciid) {
		// TODO Auto-generated method stub
		return cartItemDAO.getcartitem(Ciid);
	}

	@Override
	public void removeAllCart(List<CartItem> cartItems) {
		// TODO Auto-generated method stub
		cartItemDAO.removeAllCart(cartItems);
	}

}
