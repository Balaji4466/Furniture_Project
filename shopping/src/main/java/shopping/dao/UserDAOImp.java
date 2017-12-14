package shopping.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import shopping.model.Cart;
import shopping.model.User;

@Repository
public class UserDAOImp implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public void save(User user) {
		// TODO Auto-generated method stub
		Session s= sessionFactory.openSession();
		org.hibernate.Transaction tx = s.beginTransaction();
		user.setRoll("ROLE_USER");
		user.setEnabled(true);
		
		Cart newCart = new Cart();
        newCart.setUser(user);
        user.setCart(newCart);
        s.saveOrUpdate(user);
        s.saveOrUpdate(newCart);
        tx.commit();
        s.close();
	}

	@Override
	@Transactional
	public void update(User user)
	{
		// TODO Auto-generated method stub	
		sessionFactory.getCurrentSession().update(user);
	}

	@Override
	@Transactional
	public void delete(User user) 
	{
		// TODO Auto-generated method stub	
		sessionFactory.getCurrentSession().delete(user);
	}

	@Override
	@Transactional
	public boolean isValidUser(String username, String password)
	{
		// TODO Auto-generated method stub
		Session s = sessionFactory.openSession();
		org.hibernate.Transaction tx = s.beginTransaction();
		s.createQuery("from User where username= '" + username + "' and " + " password ='" + password + "'").executeUpdate();
		@SuppressWarnings("unchecked")
		List<User> ulist =(List<User>) s.createCriteria(User.class).list();
		if(ulist != null && !ulist.isEmpty())
		{
		  return true;
		}
		tx.commit();
		s.close();
		return false;
	}

	@Override
	@Transactional
	public User getuser(String username)
	{
		// TODO Auto-generated method stub
		Session s = sessionFactory.openSession();
		org.hibernate.Transaction tx = s.beginTransaction();
		User x = s.get(User.class,username);
		tx.commit();
		s.close();
		return x;
	}

	@Override
	@Transactional
	public List<User> list()
	{
		// TODO Auto-generated method stub
		Session s = sessionFactory.openSession();
		org.hibernate.Transaction tx = s.beginTransaction();
		@SuppressWarnings("unchecked")
		List<User> ulist =(List<User>) s.createCriteria(User.class).list();
		tx.commit();
		s.close();
		return ulist;
	}
}
