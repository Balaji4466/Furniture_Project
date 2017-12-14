package shopping.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shopping.dao.SupplierDAO;
import shopping.model.Supplier;

@Service
public class SupplierServiceImp implements SupplierService{

	@Autowired
	private SupplierDAO supplierDAO;
	
	@Override
	public void createorupdate(Supplier obj) {
		// TODO Auto-generated method stub
		
		supplierDAO.createorupdate(obj);
		
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		supplierDAO.delete(id);
	}

	@Override
	public Supplier getSupplier(String id) {
		// TODO Auto-generated method stub
		return supplierDAO.getSupplier(id);
	}

	@Override
	public List<Supplier> getsupplier() {
		// TODO Auto-generated method stub
		return supplierDAO.getsupplier();
	}

}
