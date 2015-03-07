package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import domain.User;



public interface UserDAO extends JpaRepository<User, Integer>{
	
	
	public final static String FIND_BY_LOGIN_PASSWORD_QUERY = 	"SELECT u " + 
            													"FROM User u " +
            													"WHERE u.password = :password" +
            													"AND u.login = :login";
	
	
	@Query(FIND_BY_LOGIN_PASSWORD_QUERY)
	User find(@Param("login") String login, @Param("password") String password);

}
