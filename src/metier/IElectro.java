package metier;

import java.sql.SQLException;
import java.util.List;

public interface IElectro {
	public void addElectro(Electro e) throws SQLException;
	public List<Electro> listeElectro();
	public User getElectro (String reference);
	public void updateElectro(User u);
	public void suppElectro(String reference);
	

}
