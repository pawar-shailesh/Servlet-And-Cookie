

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletContextTwo
 */
@WebServlet("/ServletContextTwo")
public class ServletContextTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletContextTwo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("***Servlet Two***<br>");
		ServletConfig config=getServletConfig();
		out.println("Value of P1 :"+config.getInitParameter("P1")+"<br>");
		out.println("Value of P2 :"+config.getInitParameter("P2")+"<br>");
		out.println("Value of P3 :"+config.getInitParameter("P3")+"<br>");
		out.println("Value of P4 :"+config.getInitParameter("P4")+"<br>");
		ServletContext application=getServletContext();
		out.println("Value of P5 :"+application.getInitParameter("P5")+"<br>");
		out.println("***End Of Servlet Two");
	}

}
