package shopping.service;

import java.util.List;
import shopping.model.Supplier;

public interface SupplierService {

	public void createorupdate(Supplier obj);
	public void delete(String id);
	public Supplier getSupplier(String id);
	public List<Supplier> getsupplier();
}
