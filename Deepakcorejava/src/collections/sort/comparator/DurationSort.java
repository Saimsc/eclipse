package collections.sort.comparator;
import java.util.Comparator;
public class DurationSort implements Comparator<Movie> {
	@Override
	public int compare(Movie o1,Movie o2)
	{
		float duration1 = o1.getDuration();
		float duration2 = o2.getDuration();
return -Float.compare(duration1,duration2);
	}
}
