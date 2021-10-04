package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Electro;
import metier.gestionElectro;

public class PostAdd extends javax.servlet.http.HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     String ville = request.getParameter("ville");
	     String annanceur = request.getParameter("annanceur");
	     float prix =Float.valueOf(request.getParameter("prix"));
	     String description = request.getParameter("description");
	     String reference = request.getParameter("reference");
	     String telephone = request.getParameter("telephone");

	     gestionElectro gst = new gestionElectro();
	     try {
	    	 gst.addElectro(new Electro(reference, description,  telephone,annanceur,  ville, prix));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     PrintWriter out = response.getWriter();
	      out.println("<html><body>");
	      out.println("<h1>"+annanceur+"<h1>");
	      out.println("<h1>"+description+"<h1>");
	      out.println("<h1>"+telephone+"<h1>");

	      out.println("</body></html>");
	     request.getRequestDispatcher("suc.html").forward(request, response);
	     
		
	}

}
