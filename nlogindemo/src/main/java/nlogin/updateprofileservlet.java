package nlogin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updateprofileservlet")
public class updateprofileservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id=request.getParameter("uid");
		String username=request.getParameter("uname");
		String password=request.getParameter("pass");
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		String address=request.getParameter("address");
		
		boolean isTrue;
		isTrue=loginDButil.updateuser(id, username, password, name,phone, address,email);
		
		if(isTrue==true)
		{
			List<user> userdetails=loginDButil.getuserdetails(id);
			request.setAttribute("userdetails", userdetails);
			RequestDispatcher dis=request.getRequestDispatcher("myprofile.jsp");
			dis.forward(request, response);
		}
		
		else {
			List<user> userdetails=loginDButil.getuserdetails(id);
			request.setAttribute("userdetails", userdetails);
			RequestDispatcher dis=request.getRequestDispatcher("myprofile.jsp");
			dis.forward(request, response);
		}
		
	}

}
