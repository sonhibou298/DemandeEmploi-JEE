package sn.isi.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sn.isi.dao.EntrImpl;
import sn.isi.dao.IEntreprise;
import sn.isi.entities.Entreprise;

/**
 * Servlet implementation class InscripServlet
 */
@WebServlet("/Inscrip")
public class InscripServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IEntreprise edao;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InscripServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
			edao = new EntrImpl();
			
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
		
			String nomEntreprise = request.getParameter("nomE");
			String email = request.getParameter("emailE");
			String password = request.getParameter("passwordE");
			int tel = Integer.parseInt(request.getParameter("tel"));
			String adresse = request.getParameter("adresse");
			
			Entreprise e = new Entreprise();
			e.setNomEntreprise(nomEntreprise);
			e.setEmail(email);
			e.setPassword(password);
			e.setTelephone(tel);
			e.setAdresse(adresse);
			edao.add(e);
		
		response.sendRedirect("index.jsp");
		 

	}

}
