package control;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import dao.Connector;

/**
 * Servlet implementation class Performer
 */
@WebServlet("/Performer")
public class Performer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Performer() {
        super();
        
        Connector.printAllData();
    }
    
    public void init() throws ServletException
    {
    	System.out.println("init");
    	Connector.printAllData();
    }

}
