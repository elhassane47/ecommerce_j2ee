package metier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class gestionImm implements Immob{

	@Override
	public void addImo(Immo im) throws SQLException {
		Connection cn=null;
		PreparedStatement ps = null ;
		
			
				try {
					Class.forName("com.mysql.jdbc.Driver");

					cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/annance","root", "");
					ps = cn.prepareStatement("insert into immobilier values (?,?,?,?,?,?,?,?,?)");
					ps.setInt(1, im.getId_immo());
					ps.setString(2,im.getReference() );
					ps.setString(3,im.getDescriptiion() );
					ps.setString(4,im.getVille() );
					ps.setFloat(5,im.getSurface());
					ps.setString(6,im.getAnnaceur() );
					ps.setFloat(7,im.getPrix());
					ps.setString(8,im.getAdresse() );
					ps.setString(9,im.getTelephone() );
					ps.executeUpdate();
					ps.close();
				
					
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				
	}

	@Override
	public List<Immo> listeImmo() {
		List<Immo> listeImmo = new ArrayList<Immo>();
		Connection cn=null;
		PreparedStatement ps = null ;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/annance","root", "");
			   ps = cn.prepareStatement("select * from immobilier");
			ResultSet st = ps.executeQuery();
			while(st.next())
			{
				Immo im = new Immo();
				im.setId_immo(st.getInt("id"));
				im.setAdresse(st.getString("adresse"));
				im.setAnnaceur(st.getString("annanceur"));
				im.setDescriptiion(st.getString("description"));
				im.setPrix(st.getFloat("prix"));
				im.setReference(st.getString("reference"));
				im.setSurface(st.getFloat("surface"));
				im.setTelephone(st.getString("telephone"));
				im.setVille(st.getString("ville"));
				listeImmo.add(im);
			}
			ps.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	   
		
		

		return listeImmo;
	}

	@Override
	public User getImmo(String reference) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateImmo(Immo iim) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void suppImmo(String reference) {
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
				ps = cn.prepareStatement("delete from immobilier where reference=?");
				ps.setString(1, reference);
				ps.executeUpdate();
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
