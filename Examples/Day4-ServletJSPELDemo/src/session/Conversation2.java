package session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Conversation2
 */
@WebServlet("/c2")
public class Conversation2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Conversation2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	private void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String readfromrequest = (String) request.getAttribute("key1");
		System.out.println("DATA from previous conversation"+readfromrequest);
		
		String readfromsession = (String) request.getSession().getAttribute("key2");
		System.out.println("DATA from session"+readfromsession);
		
		String readfromapplication = (String) request.getServletContext().getAttribute("key3");
		System.out.println("DATA from application"+readfromapplication);
		
	}

}
