package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utils.ProcessText;

/**
 * Servlet implementation class MobileController
 */
@WebServlet("/MobileController")
public class MobileController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MobileController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s= request.getParameter("mobile");
		s=ProcessText.processMobileInput(s);
		System.out.println(s+ProcessText.mobileValidator(s));		
		if (ProcessText.mobileValidator(s)) {
			response.getWriter().append("Served at: ").append(request.getContextPath()).append("\t"+s);
		}else {
			String path = "/index.html";
			ServletContext servletContext = getServletContext();
	        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(path);
	        requestDispatcher.forward(request, response);
		}		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
