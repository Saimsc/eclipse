package collections.sort.comparator;

public class Movie {
private String name;
private String director;
private float rating;
private float duration;

public Movie(){
	
}

public Movie(String name, String director, float rating, float duration) {
	super();
	this.name = name;
	this.director = director;
	this.rating = rating;
	this.duration = duration;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDirector() {
	return director;
}

public void setDirector(String director) {
	this.director = director;
}

public float getRating() {
	return rating;
}

public void setRating(float rating) {
	this.rating = rating;
}

public float getDuration() {
	return duration;
}

public void setDuration(float duration) {
	this.duration = duration;
}

@Override
public String toString() {
	return "Movie [name=" + name + ", director=" + director + ", rating=" + rating + ", duration=" + duration + "]";
}

}
