package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ValidateServlet
 */
@WebServlet("/validate")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public ValidateServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	private void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String path = "/display";
		PrintWriter out = response.getWriter();
		if (age <= 0) {
			path = "/error.html";
		} else if (age >= 300) {
			out.println("PROBABLY A DINO");
		} else if (age > 65) {
			out.println("SENIOR CITIZEN");
		} else if (age > 18) {
			out.println("BORING ADULT LIFE");
		} else {
			out.println("HAPPINESS");
		}

		RequestDispatcher rd = request.getRequestDispatcher(path);
		rd.forward(request, response);
		//rd.include(request, response);
		//out.println("");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

}
