package shopping.dao;

import java.util.List;

import shopping.model.Product;

public interface ProductDAO {

	public void createorupdate(Product obj);
	public void delete(Integer pid);
	public Product getproduct(Integer pid);
	public List<Product> getproduct();
}
