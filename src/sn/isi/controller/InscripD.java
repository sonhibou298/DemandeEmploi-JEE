package sn.isi.controller;

import java.io.IOException;
import java.util.Iterator;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.isi.dao.DemImpl;
import sn.isi.dao.IDemandeur;
import sn.isi.entities.Demandeur;

/**
 * Servlet implementation class InscripD
 */
@WebServlet("/InscripD")
public class InscripD extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IDemandeur ddao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InscripD() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		ddao = new DemImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		  
		request.getRequestDispatcher("WebContent/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		// TODO Auto-generated method stub
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		//
		
		  Cookie cookie = new Cookie("prenom", prenom); 
		  cookie.setMaxAge(60 * 60 * 24 * 365); 
		  response.addCookie(cookie);
		 
		//
		
		Demandeur dem = new Demandeur();
		dem.setNom(nom);
		dem.setPrenom(prenom);
		dem.setEmail(email);
		dem.setPassword(password);
		ddao.add(dem);
		response.sendRedirect("index.jsp");
	}

}
