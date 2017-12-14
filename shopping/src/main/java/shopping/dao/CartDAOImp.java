package shopping.dao;

import java.io.IOException;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import shopping.model.Cart;

@Repository
@Transactional
public class CartDAOImp implements CartDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Cart getCartById(int cartId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cart validate(int cartId) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Cart cart) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cart> getCartByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
