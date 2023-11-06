package nlogin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/customerinsertservlet")
public class customerinsertservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String mobileno=request.getParameter("mobilenumber");
		String email=request.getParameter("email1");
		String address=request.getParameter("address");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		boolean isTrue;
		
		isTrue=loginDButil.insertcustomer(username, password, name, mobileno, address, email);
		if (isTrue==true)
		{
			RequestDispatcher dis=request.getRequestDispatcher("nlogin.jsp");
			dis.forward(request, response);
		}
		else {
			RequestDispatcher dis=request.getRequestDispatcher("nregister.jsp");
			dis.forward(request, response);
		}
		
	}

}
