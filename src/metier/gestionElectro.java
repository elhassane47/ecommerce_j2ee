package metier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class gestionElectro  implements IElectro{

	@Override
	public void addElectro(Electro e) throws SQLException {
		Connection cn=null;
		PreparedStatement ps = null ;
		
			try {
				Class.forName("com.mysql.jdbc.Driver");
				cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/annance","root", "");
				 ps = cn.prepareStatement("insert into electronic values (?,?,?,?,?,?,?)");
				 ps.setInt(1, e.getId_electro());
				 ps.setString(2,e.getReference());
				 ps.setString(3,e.getDescription() );
				 ps.setString(4,e.getAnnanceur());
				 ps.setString(5,e.getVille() );
				 ps.setFloat(6, e.getPrix());
				 ps.setString(7,e.getTelephone());

				 ps.executeUpdate();
				 ps.close();

			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			
	
			
	}

	@Override
	public List<Electro> listeElectro() {
		
		List<Electro> listeElectro = new ArrayList<Electro>();
		Connection cn=null;
		PreparedStatement ps = null ;
		
			
				try {
					Class.forName("com.mysql.jdbc.Driver");
					cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/annance","root", "");
					 ps = cn.prepareStatement("select * from electronic");
					 ResultSet st = ps.executeQuery();
						while (st.next())
						{
							Electro el = new Electro();
							el.setId_electro(st.getInt("id_electro"));
							el.setAnnanceur(st.getString("ananceur"));
							el.setDescription(st.getString("description"));
							el.setPrix(st.getFloat("prix"));
							el.setReference(st.getString("reference"));
							el.setVille(st.getString("ville"));
							el.setTelephone(st.getString("telephone"));

							
							listeElectro.add(el);
								
						}
						ps.close();
						
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
	return listeElectro ;

	}

	@Override
	public User getElectro(String reference) {
		return null;
	}

	@Override
	public void updateElectro(User u) {
		
	}

	@Override
	public void suppElectro(String reference) {
		Connection cn=null;
		PreparedStatement ps = null ;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/annance","root", "");
			ps = cn.prepareStatement("delete from electronic where reference=?");
			ps.setString(1, reference);
			ps.executeUpdate();
			ps.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
