package sn.isi.controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.isi.dao.IOffre;
import sn.isi.dao.OffreImpl;
import sn.isi.entities.Offre;

/**
 * Servlet implementation class ListeOfServelet
 */
@WebServlet("/ListeOffre")
public class ListeOfServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IOffre offres;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListeOfServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		offres = new OffreImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String page = request.getParameter("page").toString();
		if(page.equals("listeOffre")) {
			Offre off = offres.get(0);
			request.setAttribute("listeOffre", off);
			request.getRequestDispatcher("WEB-INF/views/offre/listeOffre.jsp").forward(request, response);
		}
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
