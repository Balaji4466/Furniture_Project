package shopping.dao;

import java.util.List;
import shopping.model.Category;

public interface CategoryDAO {

	public void createorupdate(Category obj);
	public void delete(Integer cid);
	public Category getcategory(Integer cid);
	public List<Category> getcategory();
}
