import java.util.Scanner;
public class WordCount {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("sentence");
	String sentence=sc.nextLine();
	String word[]=sentence.split(",");
	int count = word.length;
	System.out.println("the word count is:"+count);


	}
}


