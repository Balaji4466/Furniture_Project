package shopping.service;

import java.util.List;

import shopping.model.Product;

public interface ProductService {

	public void createorupdate(Product obj);
	public void delete(Integer pid);
	public Product getproduct(Integer pid);
	public List<Product> getproduct();
}
