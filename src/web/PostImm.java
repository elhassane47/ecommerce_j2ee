package web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Immo;
import metier.gestionImm;

/**
 * Servlet implementation class PostImm
 */

public class PostImm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostImm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ville = request.getParameter("ville");
	     String annanceur = request.getParameter("annanceur");
	     float prix =Float.valueOf(request.getParameter("prix"));
	     float surface =Float.valueOf(request.getParameter("surface"));
	     String adresse = request.getParameter("description");
	     String description = request.getParameter("description");
	     String reference = request.getParameter("reference");
	     String telephone = request.getParameter("telephone");
	    gestionImm gst = new gestionImm();
	    try {
			gst.addImo(new Immo(reference, description, surface, annanceur, prix, adresse,  telephone,ville));
		     request.getRequestDispatcher("suc.html").forward(request, response);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
	}

}
