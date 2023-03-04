package collections.sort.comparator;
import java.util.Comparator;
public class RatingSort implements Comparator<Movie> {
	@Override
	public int compare(Movie o1,Movie o2)
	{
		float rating1 = o1.getRating();
		float rating2 = o2.getRating();
return -Float.compare(rating1,rating2);
	}
}


