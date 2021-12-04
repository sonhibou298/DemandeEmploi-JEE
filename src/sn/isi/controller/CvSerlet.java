package sn.isi.controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.isi.dao.CvImpl;
import sn.isi.dao.ICv;
import sn.isi.entities.Cv;

/**
 * Servlet implementation class CvSerlet
 */
@WebServlet("/Cv")
public class CvSerlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ICv cvdao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CvSerlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/** 
	 * @see Servlet#init(ServletConfig)
	 */
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		cvdao = new CvImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("WEB-INF/views/cv/cv.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nom = request.getParameter("nomC");
		String prenom = request.getParameter("prenomC");
		int age = Integer.parseInt(request.getParameter("age"));
		String email = request.getParameter("emailC");
		int telephone = Integer.parseInt(request.getParameter("tel"));
		String adresse = request.getParameter("adresse");
		String specialite = request.getParameter("specialite");
		String nivEtude = request.getParameter("nivEtude");
		String exp = request.getParameter("exp");
		int dem = Integer.parseInt(request.getParameter("dem"));
		
		Cv cv = new Cv();
		cv.setNom(nom);
		cv.setPrenom(prenom);
		cv.setAge(age);
		cv.setEmail(email);
		cv.setTelephone(telephone);
		cv.setAdresse(adresse);
		cv.setSpecialite(specialite);
		cv.setNivEtude(nivEtude);
		cv.setExpProf(exp);
		cv.setIdDemandeur(dem);
		cvdao.add(cv);
		response.sendRedirect("accueilD.jsp");
	}

}
