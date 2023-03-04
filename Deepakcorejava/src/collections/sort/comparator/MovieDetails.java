package collections.sort.comparator;
import java.util.*;
public class MovieDetails {

	public static void main(String[] args) {
		Movie m1= new Movie("RRR","rajamouli",8,3);
		Movie m2= new Movie("bahubali","rajamouli",9,3);
		Movie m3= new Movie("leader","sekhar",9,2.3f);
		Movie m4= new  Movie("saaho","sujit",5,2.45f);
		Movie m5= new  Movie("legend","boyapati",8.5f,3);
		
		List<Movie> movieList = new LinkedList<Movie>();
		movieList.add(m1);
		movieList.add(m2);
		movieList.add(m3);
		movieList.add(m4);
		movieList.add(m5);
		
		/*displayList(movieList);
	}
	public static void displayList(List<Movie> mlist) {
		for(Movie m:mlist) {
			System.out.println(m);
		}
	}*/
	
displayList(movieList);
	
Scanner sc=new Scanner(System.in);
System.out.println("sorting based upon:\n1.Name\n2.Rating\n3.Duration\n4.Director");
System.out.println("enter the choice:");
int choice=sc.nextInt();

sorting(movieList,choice);
	}
	public static void sorting(List<Movie> movieList,int choice) {
		if(choice == 1) {
			//sorting based upon name
			NameSort n = new NameSort();
			Collections.sort(movieList,n);//here n(object) comes from comparing names in namesort class
			System.out.println("=======================name sort============");
	        displayList(movieList);	
		}
		else if(choice == 2) {
			//sorting based upon rating
			RatingSort r = new RatingSort();
			Collections.sort(movieList,r);
			System.out.println("=======================rating sort============");
			displayList(movieList);	
		}
		else if(choice == 3) {
			//sorting based upon duration
			DurationSort d = new DurationSort();
			Collections.sort(movieList,d);
			System.out.println("=======================duration sort============");
			displayList(movieList);	
		}
		else if(choice == 4) {
			//sorting based upon director
			DirectorSort de = new DirectorSort();
			Collections.sort(movieList,de);
			System.out.println("=======================director sort============");
			displayList(movieList);	
		}
		else {
			System.out.println("invalid input");
		}
		}
		public static void displayList(List<Movie> mlist) {
			for(Movie m:mlist) {
				System.out.println(m);
			}
			System.out.println("=========================");
		}
	
	}
