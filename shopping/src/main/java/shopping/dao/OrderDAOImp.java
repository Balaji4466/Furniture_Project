package shopping.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import shopping.model.UserOrder;

@Repository
@Transactional
public class OrderDAOImp implements OrderDAO {

	@Override
	public void addOrder(UserOrder userOrder) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getOrderGrandTotal(int cartId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
