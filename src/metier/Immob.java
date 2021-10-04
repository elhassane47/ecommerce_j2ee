package metier;

import java.sql.SQLException;
import java.util.List;

public interface Immob {
	public void addImo(Immo im) throws SQLException;
	public List<Immo> listeImmo();
	public User getImmo (String reference);
	public void updateImmo(Immo iim);
	public void suppImmo(String reference);

}
