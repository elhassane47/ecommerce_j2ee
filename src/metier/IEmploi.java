package metier;

import java.sql.SQLException;
import java.util.List;

public interface IEmploi {
	public void addEmploi(Emploi e) throws SQLException;
	public List<Emploi> listeEmploi();
	public User getEmploi (String titre);
	public void updateEmploi(User titre);
	public void suppEmploi(String titre);
}
