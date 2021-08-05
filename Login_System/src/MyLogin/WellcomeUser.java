package MyLogin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/wellcome")
public class WellcomeUser extends HttpServlet{
	
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
	
		PrintWriter out =res.getWriter();
	String name=req.getParameter("username");
	out.print("<div  style=background-color:pink width:200 height:400><h2>Wellcome..... " + name + "<div>");
}
}
