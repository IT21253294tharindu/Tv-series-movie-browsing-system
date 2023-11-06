package nlogin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/nloginservlet")
public class nloginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get login details from the user
		String username=request.getParameter("uid");
		String password=request.getParameter("psw");
		
		//validate
		
		
		try {
			
			   
			if(loginDButil.validate(username, password)) {
			
		List<user>userdetails= loginDButil.validates(username, password);
		   request.setAttribute("userdetails", userdetails);	
		 RequestDispatcher dis=request.getRequestDispatcher("myprofile.jsp");
			dis.forward(request, response);
		}
		
		else {
			response.sendRedirect("nlogin.jsp");
		}
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		


}
}
