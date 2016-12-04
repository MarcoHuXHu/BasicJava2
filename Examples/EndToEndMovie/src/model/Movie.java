package model;

public class Movie {
	
	private int id;
	private String name;
	private String heroName;
	private double avgRating;
	public Movie(int id, String name, String heroName, double avgRating) {
		super();
		this.id = id;
		this.name = name;
		this.heroName = heroName;
		this.avgRating = avgRating;
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHeroName() {
		return heroName;
	}
	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}
	public double getAvgRating() {
		return avgRating;
	}
	public void setAvgRating(double avgRating) {
		this.avgRating = avgRating;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", heroName=" + heroName + ", avgRating=" + avgRating + "]";
	}
	

}
