

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import business.CustomerBO;

import java.sql.*;
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        int userid = Integer.parseInt(request.getParameter("username"));
        String password = request.getParameter("password");
    	CustomerBO cusBO=new CustomerBO();
    	boolean x = false;
        try {
			if(cusBO.validateLogin(userid, password))
			{
			    RequestDispatcher rs = request.getRequestDispatcher("userLogged.jsp");
			    rs.forward(request, response);
			}
			else
			{
			   out.println("Username or Password incorrect");
			   RequestDispatcher rs = request.getRequestDispatcher("invalidLogin.jsp");
			   rs.include(request, response);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }  
}