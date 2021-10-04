package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import metier.Connecte;
import metier.User;

/**
 * Servlet implementation class login
 
@WebServlet("/login")*/
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     Connection  cn = null ;
	     PreparedStatement ps =null;

	     String email = request.getParameter("email");
	     String pass = request.getParameter("password");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/annance","root", "");
			ps = cn.prepareStatement("select * from user where email=? and password=?");
			ps.setString(1, email);
			ps.setString(2,pass);
		    ResultSet res=ps.executeQuery();
		    
		    if(res.next())
		    {
		    	User u = new User(res.getInt("id_user"),res.getString("nom"),res.getString("prenom"),
		    			         res.getString("ville"),res.getString("email"),res.getString("telephone"),
		    			          res.getString("sexe"),res.getString("activite"),
		    			          res.getString("user_name"),res.getString("password"));
		    	HttpSession session = request.getSession();
		    	session.setAttribute("login", u);
		    	PrintWriter out = response.getWriter();
		    	 out.println("<html><body>");
		         out.println("<h1>"+u.getActivite()+"<h1>");
		         out.println("<h1>"+u.getSexe()+"<h1>");
		         out.println("<h1>"+u.getEmail()+"<h1>");
		         out.println("<h1>"+u.getUsername()+"<h1>");
		         out.println("</body></html>");
		        // request.setAttribute("login",u);
		        request.getRequestDispatcher("indexo.jsp").forward(request, response);
		    	
		    }

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
	     
	}

}
