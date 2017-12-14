package shopping.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class UserOrder implements Serializable {
	
	private static final long serialVersionUID = 16L;

	@Id
	@GeneratedValue
	private int userOrderId;
	
	@OneToOne
    @JoinColumn(name = "cartid")
	private Cart cart;
	
	@OneToOne
    @JoinColumn(name = "username")
	private User user;
	
	public int getUserOrderId() {
		return userOrderId;
	}
	public void setUserOrderId(int userOrderId) {
		this.userOrderId = userOrderId;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
