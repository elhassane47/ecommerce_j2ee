package metier;
import java.sql.SQLException;
import java.util.*;


public interface IUser {
	public void addUser(User u) throws SQLException;
	public List<User> listeUser();
	public User getUser (String username);
	public void updateUser(User u);
	public void suppUser(String username);
	
	
	

}
