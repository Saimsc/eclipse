package collections.set.book;
import java.util.TreeSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;
public class BookDetails {
	public static void main(String[] args) {
		Book b1=new Book("computer networks","john","pearson");
		Book b2=new Book("harrypotter","jk bowling","readbook");
		Book b3=new Book("digital analog","james","pearson");
	    Book b4=new Book("harrypotter part2","jk bowling","readbook");
	    Book b5=new Book("the complete java","james gosling","sun publications");
	   
	    
	    List<Book> bookList=new ArrayList<Book>();
	    bookList.add(b1);
	    bookList.add(b2);
	    bookList.add(b3);
	    bookList.add(b4);
	    bookList.add(b5);
	   
	    displayList(bookList);
	    getBookNames(bookList);
	}
	 
		public static void getBookNames(List<Book> bList) {
			Set<String> publisherSet=new TreeSet<String>();
		    
		    for(Book p1:bList) {       //p1=b2
		    	String publisher=p1.getPublisher();   //publisher=readbook
		    	if(!publisherSet.contains(publisher)) {
		    		publisherSet.add(publisher);
		    		System.out.println("publisher:"+publisher);  //publisher:readbook
		    		for(Book p2:bList) {       //p2=b1
		    			if(p2.getPublisher().equals(publisher))   //if(pearson.equals
		    				System.out.println(p2.getName());
		    		}
		    		
		    		System.out.println("================================================================================");
		    	}
		    }
		}
	    
	public static void displayList(List<Book> bList) {
		for(Book b:bList) {
			System.out.println(b);
		}
		System.out.println("==============================================================================================");
	}
}