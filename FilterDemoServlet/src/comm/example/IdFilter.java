package comm.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;


@WebFilter("/addUser")
public class IdFilter implements Filter {

    
	public void destroy() {
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//here we want to check that id should not be negative 
		 PrintWriter out = response.getWriter();
	   
		HttpServletRequest req = (HttpServletRequest)request;
		int id = Integer.parseInt(req.getParameter("aid"));
		if(id>1) {
			chain.doFilter(request, response);
		}
		else
		{
			  out.println("invalid input");
		}
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
