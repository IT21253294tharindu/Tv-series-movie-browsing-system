package adminlogin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import adminlogin.nadminloginutil;
import adminlogin.admin;


@WebServlet("/nadminloginservlet")
public class nadminloginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("uid");
		String password=request.getParameter("psw");
		
		//validate
		
		
		try {
			
			   
			if(nadminloginutil.validate(username, password)) {
			
		List<admin>admindetails= nadminloginutil.validates(username, password);
		   request.setAttribute("admindetails", admindetails);	
		 RequestDispatcher dis=request.getRequestDispatcher("adminmyprofile.jsp");
			dis.forward(request, response);
		}
		
		else {
			response.sendRedirect("nadminlogin.jsp");
		}
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		


}
}
