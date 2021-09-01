

import java.util.logging.Logger;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class httpListenerDemo
 *
 */
@WebListener
public class httpListenerDemo implements HttpSessionListener {

    public void sessionCreated(HttpSessionEvent arg0)  { 
         Logger log=Logger.getAnonymousLogger();
         HttpSession session=arg0.getSession();
         log.info(session+" created");
         log.info("ID :"+session.getId() +"MaxInactiveInterval :"+session.getMaxInactiveInterval());
    }

	
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
    	Logger log=Logger.getAnonymousLogger();
        HttpSession session=arg0.getSession();
        log.info("********************************");
        log.info(session+" destroyed");
        log.info("ID :"+session.getId() +"MaxInactiveInterval :"+session.getMaxInactiveInterval());
    }
	
}
