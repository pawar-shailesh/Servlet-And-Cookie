

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class AuthenticationFilter
 */
@WebFilter("/AuthenticationFilter")
public class AuthenticationFilter implements Filter {

	public void destroy() {
		System.out.println("Destroy method called in "+this.getClass().getName());
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("doFilter() method is called in "+this.getClass().getName());
		HttpServletRequest req=(HttpServletRequest)request;
		HttpServletResponse res=(HttpServletResponse)response;
		String userName=req.getParameter("username");
		String passWord=req.getParameter("password");

		if(!(userName.equalsIgnoreCase("admin") && passWord.equals("admin")))
		{
			System.out.println("Unauthorized User");
			res.sendRedirect("index.html");
		}

		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("init() mathod is called in "+this.getClass().getName());
	}

}
