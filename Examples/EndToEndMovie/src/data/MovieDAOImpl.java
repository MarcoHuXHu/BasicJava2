package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Movie;

public class MovieDAOImpl implements MovieDAO {

	protected Connection conn;
	private static final String INSERT = "INSERT INTO demo.movies (id, name, heroname, avgrating) VALUES (";
	private static final String UPDATE = "UPDATE demo.movies SET id =";
	private static final String DELETE = "DELETE FROM demo.movies WHERE ID = ";
	private static final String SELECTALL = "SELECT * FROM demo.movies;";
	private static final String SELECTONE = "SELECT * FROM demo.movies WHERE ID = ;";

	private void openConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "password");
	}

	private void closeConnection() throws SQLException {

		this.conn.close();
	}

	@Override
	public int insertMovie(Movie m) throws ClassNotFoundException, SQLException {
		openConnection();
		Statement stmt = this.conn.createStatement();
		int result = stmt.executeUpdate(
				INSERT + m.getId() + ", " + m.getName() + ", " + m.getHeroName() + ", " + m.getAvgRating() + ");");
		closeConnection();
		return result;
	}

	@Override
	public int updateMovie(Movie m) throws ClassNotFoundException, SQLException {
		openConnection();
		Statement stmt = this.conn.createStatement();
		int result = stmt.executeUpdate(UPDATE + m.getId() + ", NAME = '" + m.getName() + "', HERONAME = '"
				+ m.getHeroName() + "', AVGRATING = " + m.getAvgRating() + " WHERE ID = " + m.getId() + ";");
		closeConnection();
		return result;
	}

	@Override
	public int deleteMovie(int id) throws ClassNotFoundException, SQLException {
		openConnection();
		Statement stmt = this.conn.createStatement();
		int result = stmt.executeUpdate(DELETE + id + ";");
		closeConnection();
		return result;
	}

	@Override
	public ArrayList<Movie> findAllMovies() throws ClassNotFoundException, SQLException {
		ArrayList<Movie> list = new ArrayList<Movie>();
		openConnection();
		Statement stmt = this.conn.createStatement();
		ResultSet rs = stmt.executeQuery(SELECTALL);
		while (rs.next()) {
			Movie m = new Movie(rs.getInt("id"), rs.getString("name"), rs.getString("heroname"),
					rs.getDouble("avgrating"));
			list.add(m);
		}
		closeConnection();
		return list;
	}

	@Override
	public Movie findById(int id) throws ClassNotFoundException, SQLException {
		Movie m = new Movie();
		openConnection();
		Statement stmt = this.conn.createStatement();
		ResultSet rs = stmt.executeQuery(SELECTONE + id + ";");
		while (rs.next()) {
			m = new Movie(rs.getInt("id"), rs.getString("name"), rs.getString("heroname"), rs.getDouble("avgrating"));
		}
		closeConnection();
		return m;
	}

}
