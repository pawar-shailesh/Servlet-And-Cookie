

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionCounterSample extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean create=true; //it will crate session object on first request or will return
		HttpSession session=request.getSession(create);
		Integer counter=(Integer)session.getAttribute("myCounter");
		if(counter==null)
		{
			counter=1;
		}
		else {
			counter++;
		}
		session.setAttribute("myCounter", counter);
		response.setContentType("type/html");
		PrintWriter out=response.getWriter();
		out.println("<html");
		out.println("<head><title>Session Tracking Demo</title></head>");
		out.println("<body>");
		out.println("<h1>Session Tracking Counter Sample</h1>");
		out.println("You have hit this page :"+counter+"times <br>");
		out.println("Your session Cookie "+request.getHeader("Cookie"));
		out.println("<br>Your Session Id : "+session.getId());
		out.println("</body>");
		out.println("</html>");
		
	}

}
