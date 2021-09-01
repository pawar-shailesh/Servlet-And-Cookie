

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/LogFilter")
public class LogFilter implements Filter {

	public void destroy() {
		System.out.println("Destroy method is called in "+this.getClass().getName());
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		System.out.println("doFilter methos is called in "+this.getClass().getName() +"\n\n");
		HttpServletRequest request1=(HttpServletRequest)request;
		String ipAddress=request.getRemoteAddr();
		
		System.out.println("IP "+ipAddress +"Time "+new Date().toString() +"\n\n");
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("init method is called in "+this.getClass().getName());
	}

}
