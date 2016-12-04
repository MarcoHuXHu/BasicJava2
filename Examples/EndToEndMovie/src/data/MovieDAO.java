package data;

import java.sql.SQLException;
import java.util.ArrayList;

import model.Movie;

public interface MovieDAO {

	int insertMovie(Movie m) throws ClassNotFoundException, SQLException;

	int updateMovie(Movie m) throws ClassNotFoundException, SQLException;

	int deleteMovie(int id) throws ClassNotFoundException, SQLException;

	ArrayList<Movie> findAllMovies() throws ClassNotFoundException, SQLException;

	Movie findById(int id) throws ClassNotFoundException, SQLException;

}