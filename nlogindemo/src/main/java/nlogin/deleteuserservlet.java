package nlogin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deleteuserservlet")
public class deleteuserservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id=request.getParameter("uid");
		
		boolean isTrue;
		
		isTrue=loginDButil.deleteuser(id);
		
		if(isTrue==true)
		{
			RequestDispatcher dis=request.getRequestDispatcher("nregister.jsp");
			dis.forward(request, response);
		}
		else {
			List<user>userdetails=loginDButil.getuserdetails(id);
			request.setAttribute("userdetails", userdetails);
			RequestDispatcher dis=request.getRequestDispatcher("myprofile.jsp");
			dis.forward(request, response);
		}
	
	}

}
