package comm.example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i + j;
		
		
		/*first method for calling of one servlet from aonther ::
		 * req.setAttribute("result", k);
        RequestDispatcher rd = req.getRequestDispatcher("/sq"); 
        rd.forward(req, res);*/
        
		
		/*
		 * second method :: using send Redirect
		 */
		res.sendRedirect("sq?result="+k); //sending data to the other servlet
		/*		PrintWriter pw = res.getWriter();
		pw.println("the result is: "+k);
*/	
	}
}
