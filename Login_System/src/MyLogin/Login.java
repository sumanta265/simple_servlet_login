package MyLogin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/user")
public class Login extends HttpServlet{
	
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		String name=req.getParameter("username");
		String pass=req.getParameter("password");
		String password="corona";
		PrintWriter out=res.getWriter();
		
		if(pass.equals(password))
		{
			RequestDispatcher rd=req.getRequestDispatcher("wellcome");
			rd.forward(req, res);
			
		}
		else
		{
			out.print("<h3 style =background-color:red>Sorry your Password is Error!!!!</h3>");
			RequestDispatcher rd=req.getRequestDispatcher("/index.html");
			rd.include(req, res);
			
		}
		
	}
	

}
