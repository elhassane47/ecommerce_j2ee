package metier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class gestionEmploi implements IEmploi{

	@Override
	public void addEmploi(Emploi e) throws SQLException {
		
		Connection cn=null;
		PreparedStatement ps = null ;
		
			
				
					try {
						Class.forName("com.mysql.jdbc.Driver");
						cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/annance","root", "");
						ps = cn.prepareStatement("insert into emploi values (?,?,?,?,?,?,?,?,?,?,?)");
						ps.setInt(1, e.getId());
						ps.setString(2,e.getTitre() );
						ps.setString(3,e.getOrganisme() );
						ps.setString(4,e.getDesc_orga() );
						ps.setString(5,e.getPoste() );
						ps.setString(6,e.getSalaire());
						ps.setString(7,e.getSecteur() );
						ps.setString(8,e.getProfile() );
						ps.setString(9,e.getVille() );
						ps.setString(10,e.getTelephone() );
						ps.setString(11,e.getEmail());
						

						ps.executeUpdate();
						ps.close();
						
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					
	}

	@Override
	public List<Emploi> listeEmploi() {
		List<Emploi> listemp = new ArrayList<Emploi>();

		Connection cn=null;
		PreparedStatement ps = null ;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/annance","root", "");
			ps = cn.prepareStatement("select * from emploi");
			ResultSet st = ps.executeQuery();
			while(st.next())
			{
				Emploi em = new Emploi();
				em.setId(st.getInt("id"));
				em.setDesc_orga(st.getString("description_orga"));
				em.setOrganisme(st.getString("organisme"));
	            em.setPoste(st.getString("description_poste"));
	            em.setProfile(st.getString("profile"));
	            em.setSalaire(st.getString("salaire"));
	            em.setSecteur(st.getString("secteur"));
	            em.setTitre(st.getString("titre"));
	            em.setVille(st.getString("ville"));
	            em.setTelephone(st.getString("telephone"));
	            em.setEmail(st.getString("email"));
	            listemp.add(em) ;
			}
			ps.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
	
	return listemp ;
	}

	@Override
	public User getEmploi(String titre) {
		return null;
	}

	@Override
	public void updateEmploi(User titre) {
		
	}

	@Override
	public void suppEmploi(String titre) {
		
		Connection cn=null;
		PreparedStatement ps = null ;
		
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/annance","root", "");
				ps = cn.prepareStatement("delete from emploi where titre=?");
				ps.setString(1, titre);
				ps.executeUpdate();
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					
	

}
}