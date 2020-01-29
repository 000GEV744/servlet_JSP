package comm.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/demoJSTL")
public class JSTLDemo extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1, "Anuj Singh"));
		list.add(new Student(2, "Ram Murti"));
		list.add(new Student(3, "Anubhav Patel"));
		
		req.setAttribute("List", list);
		RequestDispatcher rd = req.getRequestDispatcher("display.jsp");
        rd.forward(req, res);
	}
}
