package shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shopping.dao.ProductDAO;
import shopping.model.Product;

@Service
public class ProductServiceImp implements ProductService{

	@Autowired
	private ProductDAO productDAO;
	
	@Override
	public void createorupdate(Product obj)
	{
      // TODO Auto-generated method stub
	  productDAO.createorupdate(obj);
	}

	@Override
	public void delete(Integer pid) 
	{
	  // TODO Auto-generated method stub
	  productDAO.delete(pid);
	}

	@Override
	public Product getproduct(Integer pid) 
	{
		// TODO Auto-generated method stub
		return productDAO.getproduct(pid);
	}

	@Override
	public List<Product> getproduct() 
	{
		// TODO Auto-generated method stub
		return productDAO.getproduct();
	}

}
