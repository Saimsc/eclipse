package collections.sort.comparator;
import java.util.Comparator;
public class NameSort implements Comparator<Movie> {
	@Override
	public int compare(Movie o1,Movie o2) {
		String name1=o1.getName();
		String name2=o2.getName();
		return name1.compareToIgnoreCase(name2);
	}

}
