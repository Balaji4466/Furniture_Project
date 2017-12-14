package shopping.service;

import org.springframework.beans.factory.annotation.Autowired;

import shopping.dao.OrderDAO;
import shopping.model.UserOrder;

public class OrderDAOServiceImp implements OrderDAOService {

	@Autowired
	private OrderDAO orderDAO;
	@Override
	public void addOrder(UserOrder userOrder) {
		// TODO Auto-generated method stub
		orderDAO.addOrder(userOrder);
	}

	@Override
	public double getOrderGrandTotal(int cartId) {
		// TODO Auto-generated method stub
		return orderDAO.getOrderGrandTotal(cartId);
	}

}
