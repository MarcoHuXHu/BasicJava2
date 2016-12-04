package data;

public class DAOFactory {
	
	public static void getInstance() {
		// DB specific
	}
	
	public static MovieDAO getMovieDAO() {
		return new MovieDAOImpl();
	}

}
