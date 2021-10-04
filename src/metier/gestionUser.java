package metier;

import java.util.ArrayList;

import metier.Connecte ;

import java.util.List;
import java.sql.*;

public class gestionUser implements IUser{

	@Override
	public void addUser(User u)  {
		Connection cn=null;
		PreparedStatement ps = null ;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/annance","root", "");
			 ps = cn.prepareStatement("insert into user values (?,?,?,?,?,?,?,?,?,?)");
			 ps.setInt(1,u.getId());
			 ps.setString(2,u.getPrenom());
			 ps.setString(3,u.getNom());
			 ps.setString(4,u.getVille());
			 ps.setString(5,u.getEmail());
			 ps.setString(6,u.getTel());
			 ps.setString(7,u.getSexe());
			 ps.setString(8,u.getActivite());
			 ps.setString(9,u.getUsername());
			 ps.setString(10,u.getPassword());
			 ps.executeUpdate();
			 ps.close();
		
		
		
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
		
	}

	@Override
	public List<User> listeUser() {
		List<User> listeUser = new ArrayList<User>();
		Connection cn = Connecte.getConnect();
		 PreparedStatement ps =null;
		 
		 try {
			ps = cn.prepareStatement("select * from user");
			ResultSet st = ps.executeQuery();
			while (st.next())
			{
				User usr = new User();
				usr.setId(st.getInt("id_user"));
                usr.setPrenom(st.getString("prenom"));
                usr.setNom(st.getString("nom"));
                usr.setVille(st.getString("ville"));
                usr.setEmail(st.getString("email"));
                usr.setTel(st.getString("telephone"));
                usr.setSexe(st.getString("sexe"));
                usr.setActivite(st.getString("activite"));
                usr.setUsername(st.getString("user_name"));
                usr.setPassword(st.getString("password"));
                listeUser.add(usr);
        
			}
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		return listeUser;
	}

	@Override
	public User getUser(String username) {
		Connection cn = Connecte.getConnect();
		User usr = null;
		 PreparedStatement ps =null;
		 try {
			ps = cn.prepareStatement("select * from user where user_name= ?");
			ps.setString(1,username);
			ResultSet st = ps.executeQuery();
			if(st.next())
			{
				usr = new User();
				usr.setId(st.getInt("id_user"));
                usr.setPrenom(st.getString("prenom"));
                usr.setNom(st.getString("nom"));
                usr.setVille(st.getString("ville"));
                usr.setEmail(st.getString("email"));
                usr.setTel(st.getString("telephone"));
                usr.setSexe(st.getString("sexe"));
                usr.setActivite(st.getString("activite"));
                usr.setUsername(st.getString("user_name"));
                usr.setPassword(st.getString("password"));
                
			}
			ps.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
	
		return usr;
	}

	@Override
	public void updateUser(User u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void suppUser(String username) {
		Connection cn = Connecte.getConnect();

		 PreparedStatement ps =null;
		
			try {
				ps = cn.prepareStatement("delete  from user where user_name= ?");
				ps.setString(1,username);
				 ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}	

}
