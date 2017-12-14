package shopping.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shopping.dao.UserDAO;
import shopping.model.User;


@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserDAO userDAO;
	@Override
	public void save(User user) 
	{
		// TODO Auto-generated method stub
		userDAO.save(user);
	}

	@Override
	public void update(User user)
	{
		// TODO Auto-generated method stub
		userDAO.update(user);
	}

	@Override
	public void delete(User user)
	{
		// TODO Auto-generated method stub
		userDAO.delete(user);
	}

	@Override
	public boolean isValidUser(String username, String password)
	{
		// TODO Auto-generated method stub
		return userDAO.isValidUser(username, password);
	}

	@Override
	public User getuser(String username) 
	{
		// TODO Auto-generated method stub
		return userDAO.getuser(username);
	}

	@Override
	public List<User> list() 
	{
		// TODO Auto-generated method stub
		return userDAO.list();
	}
}
