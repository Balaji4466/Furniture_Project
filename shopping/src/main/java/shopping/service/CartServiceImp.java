package shopping.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import shopping.dao.CartDAO;
import shopping.model.Cart;

public class CartServiceImp implements CartService {

	@Autowired
	private CartDAO cartDAO;
	
	@Override
	public Cart getCartById(int cartId) {
		// TODO Auto-generated method stub
		return cartDAO.getCartById(cartId);
	}

	@Override
	public Cart validate(int cartId) throws IOException {
		// TODO Auto-generated method stub
		return cartDAO.validate(cartId);
	}

	@Override
	public void update(Cart cart) {
		// TODO Auto-generated method stub
		cartDAO.update(cart);
	}

	@Override
	public List<Cart> getCartByUsername(String username) {
		// TODO Auto-generated method stub
		return cartDAO.getCartByUsername(username);
	}

}
