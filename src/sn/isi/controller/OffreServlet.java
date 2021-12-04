package sn.isi.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import sn.isi.dao.EntrImpl;
import sn.isi.dao.IEntreprise;
import sn.isi.dao.IOffre;
import sn.isi.dao.OffreImpl;
import sn.isi.entities.Entreprise;
import sn.isi.entities.Offre;

/**
 * Servlet implementation class OffreServlet
 */
@WebServlet("/Offre")
public class OffreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IOffre odao;
	private IEntreprise edao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OffreServlet() {
        super(); 
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		odao = new OffreImpl();
		edao = new EntrImpl();
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//test pour le drop downlist
		List<Entreprise> listEse = edao.getAll();
		request.setAttribute("listEse", listEse);
		//Fin test
	
		request.getRequestDispatcher("WEB-INF/views/offre/faireOffre.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		  String description = request.getParameter("desc");
		  int entreprise = Integer.parseInt(request.getParameter("ese"));
		  
		  Offre offre = new Offre(); 
		  offre.setDescription(description);
		  offre.setIdEntreprise(entreprise);
		  odao.add(offre);
		  response.sendRedirect("accueil.jsp");
		 
		
	}

}
