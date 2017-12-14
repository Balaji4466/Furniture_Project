package shopping.service;

import java.util.List;
import shopping.model.Category;

public interface CategoryService {

	public void createorupdate(Category obj);
	public void delete(Integer cid);
	public Category getcategory(Integer cid);
	public List<Category> getcategory();
}
