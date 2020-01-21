package comm.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SquareServlet extends HttpServlet {

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		/*int k = (int)(req.getAttribute("result"));
		int result = k*k;
		*/
		//example of Servlet Context
		ServletContext ctx = getServletContext();
		String name = ctx.getInitParameter("name");
		PrintWriter pw = res.getWriter();
		pw.println("Hi "+name+",");
		
		int k = 0;
		
		//1. getting data via session
		/*HttpSession session = req.getSession();
		int k =(int)session.getAttribute("result");*/
		
		//2. getting data via cookie
		Cookie cookies[] = req.getCookies();
		for(Cookie c : cookies) {
			if(c.getName().equals("result")) {
				k = Integer.parseInt(c.getValue());
				k = k*k;
				
				pw.println("the result is : "+ k);
			}
		}
		
//		int k =Integer.parseInt(req.getParameter("result"));
		

		
		
	}
}