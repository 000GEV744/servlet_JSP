package comm.example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add") //by doing so we don't need the web.xml tp configure the url patterns with the servlets in the application 
public class AddServlet extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i + j;
				
		//1. sending data via httpSession 
		/*HttpSession session = req.getSession();
		session.setAttribute("result", k);
*/		
		//2. sending data over cookie
		Cookie cookie = new Cookie("result", k+""); //we can't send integer so convert it into string
		res.addCookie(cookie);
		
		
		/*first method for calling of one servlet from aonther ::
		 * req.setAttribute("result", k);
        RequestDispatcher rd = req.getRequestDispatcher("/sq"); 
        rd.forward(req, res);*/
        
		
		/*
		 * second method :: using send Redirect
		 */
		res.sendRedirect("sq"); //sending data to the other servlet via URL reWriting
		/*		PrintWriter pw = res.getWriter();
		pw.println("the result is: "+k);
*/	
	}
}
