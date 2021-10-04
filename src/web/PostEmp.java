package web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Emploi;
import metier.gestionElectro;
import metier.gestionEmploi;

public class PostEmp extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ville = request.getParameter("ville");
	     String description_orga = request.getParameter("description_orga");
	     String secteur =request.getParameter("secteur");
	     String organisme =request.getParameter("organisme");
	     String titre = request.getParameter("titre");
	     String profile = request.getParameter("profile");
	     String description_poste = request.getParameter("description_poste");
	     String telephone = request.getParameter("telephone");
	     String salaire = request.getParameter("salaire");
	     String email = request.getParameter("email");
	     gestionEmploi gst = new gestionEmploi();
	     try {
			gst.addEmploi(new Emploi(titre, organisme, description_orga,description_poste, profile, secteur, ville, salaire, telephone, email));
		     request.getRequestDispatcher("suc.html").forward(request, response);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	     

	}

}
