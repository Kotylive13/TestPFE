package services;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repositories.IUserDAO;
import domain.User;



@Service
@Transactional
public class UserService {
	
	@Autowired
	private IUserDAO userDao;
	
	/**
	 * All Users
	 */
	public Collection<User> findAll() {
		return userDao.findAll();
	}
	
	
	public User find(String login, String password) {
		return userDao.find(login, password);
	}

}
