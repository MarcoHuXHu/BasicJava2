package model;

public class Movie {
	
	private String n;
	private double r;
	private String c;
	public Movie() {
		super();
		n="Dear Zindagi";
		r = 7.8;
		c = "gender biased movie";
	}
	public Movie(String name, double rating, String comments) {
		super();
		this.n = name;
		this.r = rating;
		this.c = comments;
	}
	public String getName() {
		return n;
	}
	public void setName(String name) {
		this.n = name;
	}
	public double getRating() {
		return r;
	}
	public void setRating(double rating) {
		this.r = rating;
	}
	public String getComments() {
		return c;
	}
	public void setComments(String comments) {
		this.c = comments;
	}
	@Override
	public String toString() {
		return "Movie [name=" + n + ", rating=" + r + ", comments=" + c + "]";
	}
	

}
