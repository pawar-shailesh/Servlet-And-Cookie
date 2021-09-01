

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MultipleServlet
 */
@WebServlet("/MultipleServlet")
public class MultipleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Init() method is called in "+this.getClass().getName());
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("Destroy method is called in "+this.getClass().getName());
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("doGet() method is called in "+this.getClass().getName()+"\n\n");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		System.out.println("Hello World <br>");
	}

}
