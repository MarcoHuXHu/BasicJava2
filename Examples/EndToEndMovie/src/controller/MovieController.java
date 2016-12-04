package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import exception.MyDataException;
import model.Movie;
import service.MovieManager;

/**
 * Servlet implementation class MovieController
 */
@WebServlet(
		name = "movie/*", 
		urlPatterns = { 
				"/movie/*", 
				"/movie", 
				"/movies"
		})
public class MovieController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MovieController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getPathInfo();
		MovieManager mmgr = new MovieManager();
		switch (path) {
		case "/list":
			try {
				ArrayList<Movie> mlist = mmgr.searchAllMovies();
				request.setAttribute("mlist", mlist);
				RequestDispatcher rd = request.getRequestDispatcher("/CRUDMoviePage.jsp");
				rd.forward(request, response);
			} catch (MyDataException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			break;

		default:
			break;
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

}
