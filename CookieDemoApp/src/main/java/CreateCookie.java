

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateCookie
 */
@WebServlet("/CreateCookie")
public class CreateCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie c1=new Cookie("c1cookie","Value of Cookie 1");
		Cookie c2=new Cookie("c2cookie","Value of Cookie 2");
		response.addCookie(c1);
		response.addCookie(c2);
		PrintWriter out=response.getWriter();
		out.println("Cookies are created and set in browser.Check /ReadCookie");
	}

}
