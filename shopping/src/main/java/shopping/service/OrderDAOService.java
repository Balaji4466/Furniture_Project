package shopping.service;

import shopping.model.UserOrder;

public interface OrderDAOService {

	void addOrder(UserOrder userOrder);
    double getOrderGrandTotal(int cartId);
}
