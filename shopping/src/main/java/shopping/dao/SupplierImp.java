package shopping.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import shopping.model.Supplier;

@Repository
public class SupplierImp implements SupplierDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public void createorupdate(Supplier obj) {
		// TODO Auto-generated method stub

		Session s = sessionFactory.openSession();
		org.hibernate.Transaction tx = s.beginTransaction();
		s.saveOrUpdate(obj);
		tx.commit();
		s.close();

	}

	@Override
	@Transactional
	public void delete(String id) {
		// TODO Auto-generated method stub
		Session s = sessionFactory.openSession();
		org.hibernate.Transaction tx = s.beginTransaction();
	//	Query query = s.createQuery("delete from Supplier where id=:temp");
	//	query.setString("temp", id);
		s.createQuery("DELETE FROM Supplier where id='"+id+"'").executeUpdate();
		tx.commit();
		s.close();
	}

	@Override
	@Transactional
	public Supplier getSupplier(String id) {
		// TODO Auto-generated method stub 	
		Session s = sessionFactory.openSession();
		org.hibernate.Transaction tx = s.beginTransaction();
		Supplier x = s.get(Supplier.class, id);
		tx.commit();
		s.close();
		return x;
	}

	@Override
	@Transactional
	public List<Supplier> getsupplier() {
		// TODO Auto-generated method stub
		Session s = sessionFactory.openSession();
		org.hibernate.Transaction tx = s.beginTransaction();
		@SuppressWarnings("unchecked")
		List<Supplier> slist = (List<Supplier>) s.createCriteria(Supplier.class).list();
		tx.commit();
		s.close();
		return slist;
	}

}
