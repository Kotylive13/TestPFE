package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.User;

public interface IUserDAO{

	public User find(String login, String password);
	
}
