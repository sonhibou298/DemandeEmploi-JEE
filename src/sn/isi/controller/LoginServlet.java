package sn.isi.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.sun.net.httpserver.Authenticator.Success;

import sn.isi.dao.DemImpl;
import sn.isi.dao.EntrImpl;
import sn.isi.dao.IDemandeur;
import sn.isi.dao.IEntreprise;
import sn.isi.dao.IUser;
import sn.isi.dao.UserImpl;
import sn.isi.entities.Demandeur;
import sn.isi.entities.Entreprise;
import sn.isi.entities.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     	//private IUser userdao;
	private IEntreprise edao;
	private IDemandeur ddao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
     	@Override
     	public void init() throws ServletException {
     		//userdao = new UserImpl();
     		edao = new EntrImpl();
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
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		Entreprise e = edao.login(email, password);
		Demandeur dem = ddao.login(email, password);
		Entreprise en = edao.findId(email);
		Entreprise ese = edao.findName(email);
		if(e != null) {
			System.out.println(en);
			System.out.println(ese);
			response.sendRedirect("accueil.jsp");
		
		}else if (dem != null){
			response.sendRedirect("accueilD.jsp");	
		}else {
			PrintWriter out = response.getWriter();
			out.println("Email ou Mot de passe incorrect");
			response.sendRedirect("index.jsp");
			
		}	
	}

}
