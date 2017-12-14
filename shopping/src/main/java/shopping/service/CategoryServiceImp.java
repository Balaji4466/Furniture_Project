package shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shopping.dao.CategoryDAO;
import shopping.model.Category;

@Service
public class CategoryServiceImp implements CategoryService {
	
	@Autowired
	private CategoryDAO CategoryDAO;
	
	public void createorupdate(Category obj) {
		// TODO Auto-generated method stub
		CategoryDAO.createorupdate(obj);
	}

	@Override
	public void delete(Integer cid) {
		// TODO Auto-generated method stub
		CategoryDAO.delete(cid);
	}

	@Override
	public Category getcategory(Integer cid) {
		// TODO Auto-generated method stub
		return CategoryDAO.getcategory(cid);
	}

	@Override
	public List<Category> getcategory() {
		// TODO Auto-generated method stub
		return CategoryDAO.getcategory();
	}

}
