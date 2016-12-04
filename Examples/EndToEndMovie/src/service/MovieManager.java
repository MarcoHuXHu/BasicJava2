package service;

import java.sql.SQLException;
import java.util.ArrayList;

import data.DAOFactory;
import data.MovieDAO;
import exception.MyDataException;
import model.Movie;

public class MovieManager {

	private MovieDAO mdao = DAOFactory.getMovieDAO();

	public MovieManager() {
		//mdao 
	}

	public int createMovie(Movie m) throws MyDataException {
		try {
			int result = mdao.insertMovie(m);
			return result;
		} catch (SQLException sql) {
			throw new MyDataException("ERROR IN CREATE METHOD");
		} catch (ClassNotFoundException ce) {
			throw new MyDataException("ERROR IN CREATE METHOD");
		}
	}

	public int changeMovie(Movie m) throws MyDataException {
		try {
			int result = mdao.updateMovie(m);
			return result;
		} catch (SQLException sql) {
			throw new MyDataException("ERROR IN CREATE METHOD");
		} catch (ClassNotFoundException ce) {
			throw new MyDataException("ERROR IN CREATE METHOD");
		}
	}

	public int removeMovie(int id) throws MyDataException {
		try {
			int result = mdao.deleteMovie(id);
			return result;
		} catch (SQLException sql) {
			throw new MyDataException("ERROR IN CREATE METHOD");
		} catch (ClassNotFoundException ce) {
			throw new MyDataException("ERROR IN CREATE METHOD");
		}
	}

	public ArrayList<Movie> searchAllMovies() throws MyDataException {
		try {
			ArrayList<Movie> result = mdao.findAllMovies();
			return result;
		} catch (SQLException sql) {
			throw new MyDataException("ERROR IN CREATE METHOD");
		} catch (ClassNotFoundException ce) {
			throw new MyDataException("ERROR IN CREATE METHOD");
		}
	}

	public Movie searchById(int id) throws MyDataException {
		try {
			Movie result = mdao.findById(id);
			return result;
		} catch (SQLException sql) {
			throw new MyDataException("ERROR IN CREATE METHOD");
		} catch (ClassNotFoundException ce) {
			throw new MyDataException("ERROR IN CREATE METHOD");
		}
	}

}
