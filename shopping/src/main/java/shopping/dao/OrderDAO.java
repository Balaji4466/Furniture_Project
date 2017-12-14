package shopping.dao;

import shopping.model.UserOrder;

public interface OrderDAO {

	void addOrder(UserOrder userOrder);
    double getOrderGrandTotal(int cartId);
}
