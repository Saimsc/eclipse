import java.util.Scanner;
public class ReverseExampleUsingMethod {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the word");
		String word=sc.next();
		System.out.println("the reverse word is:"+reverseWord(word));
	}
	public static String reverseWord(String word)
	{
		String result=" ";
		for(int i=word.length()-1;i>=0;i--)
		{
			result+=word.charAt(i);
		}
return result;
	}

}
