package collections.sort.comparator;
import java.util.Comparator;
public class DirectorSort implements Comparator<Movie> {
	@Override
	public int compare(Movie o1,Movie o2) {
	
	return o1.getDirector().compareToIgnoreCase(o2.getDirector());	}
}
