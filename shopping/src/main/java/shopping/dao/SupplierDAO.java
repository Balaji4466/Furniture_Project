package shopping.dao;

import java.util.List;
import shopping.model.Supplier;

public interface SupplierDAO {
	
	public void createorupdate(Supplier obj);
	public void delete(String id);
	public Supplier getSupplier(String id);
	public List<Supplier> getsupplier();

}
