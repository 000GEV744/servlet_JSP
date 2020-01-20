package comm.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		int k = (int)(req.getAttribute("result"));
		int result = k*k;
		
		PrintWriter pw = res.getWriter();
		pw.println("the result is: "+ result);
		
		
	}
}
