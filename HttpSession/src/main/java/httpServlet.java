

import java.awt.desktop.ScreenSleepEvent;
import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class httpServlet
 */
@WebServlet("/httpServlet")
public class httpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	public void init(ServletConfig config) throws ServletException {
		Logger log=Logger.getAnonymousLogger();
		log.info("init() called in "+this.getClass().getName());
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		sleep();
		HttpSession httpsession=request.getSession();
		sleep();
		httpsession.invalidate();
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	private void sleep() {
		try {
			Thread.sleep(12000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
