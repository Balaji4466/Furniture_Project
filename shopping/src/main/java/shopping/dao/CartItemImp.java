package shopping.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import shopping.model.Cart;
import shopping.model.CartItem;
import shopping.model.Product;

@Repository
public class CartItemImp implements CartItemDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public void addCart(CartItem cartItem)
	{
		// TODO Auto-generated method stub
	
		Session s= sessionFactory.openSession();
		org.hibernate.Transaction tx=s.beginTransaction();
		s.saveOrUpdate(cartItem);
		tx.commit();
		s.close();
	}

	@Override
	@Transactional
	public void removeCart(Integer Ciid)
	{
		// TODO Auto-generated method stub
		
		Session s= sessionFactory.openSession();
		org.hibernate.Transaction tx=s.beginTransaction();
		s.createQuery("DELETE FROM CartItem where Ciid='"+Ciid+"'").executeUpdate();
		tx.commit();
		s.close();
	}


	@Override
	@Transactional
	public List<CartItem> list() 
	{
		// TODO Auto-generated method stub
		
		Session s = sessionFactory.openSession();
		org.hibernate.Transaction tx = s.beginTransaction();
		@SuppressWarnings("unchecked")
		List<CartItem> cilist =(List<CartItem>) s.createCriteria(CartItem.class).list();
		tx.commit();
		s.close();
		return cilist;
	}

	@Override
	public CartItem getcartitem(Integer Ciid) {
		// TODO Auto-generated method stub
		Session s= sessionFactory.openSession();
        org.hibernate.Transaction tx= s.beginTransaction();
        CartItem x= s.get(CartItem.class, Ciid);
        tx.commit();
        s.close();
		return x;
	}

	@Override
	@Transactional
	public void removeAllCart(List<CartItem> cartItems) {
		// TODO Auto-generated method stub
		Session s= sessionFactory.openSession();
		org.hibernate.Transaction tx=s.beginTransaction();
		@SuppressWarnings("unchecked")
		List<CartItem> cilist= cartItems;
		for(CartItem item: cilist)
		{
			Integer Ciid=item.getCiid();
			removeCart(Ciid);
		}
		tx.commit();
		s.close();
	}
}
