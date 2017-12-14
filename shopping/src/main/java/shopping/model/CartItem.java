package shopping.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table
public class CartItem implements Serializable{

	private static final long serialVersionUID = 14L;

	@Id
	@GeneratedValue
	private Integer Ciid;
	
	@ManyToOne
    @JoinColumn(name = "cartid")
	private Cart cart;
	
	@ManyToOne
    @JoinColumn(name = "pid")
	private Product product;
	
	private String name;
	private Long price;
	private Integer quantity;
	private Double totalprice;

	public Integer getCiid() {
		return Ciid;
	}
	public void setCiid(Integer ciid) {
		Ciid = ciid;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(double d) {
		this.totalprice = (double) d;
	}

}
