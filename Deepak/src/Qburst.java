import java.util.*;
public class Qburst {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		String word[]=str.split("\\s");
		String reverseString="";
		for(String s:word) {
			StringBuilder sb= new StringBuilder(s);
			sb.reverse();
			reverseString=reverseString+sb.toString()+" ";
		}
		reverseString=reverseString.trim();
		StringBuffer newstr=new StringBuffer(reverseString); 
		for(int i=0;i<reverseString.length();i=i+2) {
			if(newstr.charAt(i)>=65&&newstr.charAt(i)<=90||newstr.charAt(i)>=97&&newstr.charAt(i)<=127) {
				newstr.setCharAt(i,Character.toUpperCase(newstr.charAt(i)));
			}
			else if(newstr.charAt(i)==' ') 
		          newstr.replace(i,i+1,"#");
			else
				newstr.replace(i,i+1,"@");
		}
		for(int i=1;i<reverseString.length();i=i+2) {
			if(newstr.charAt(i)>=65&&newstr.charAt(i)<=90||newstr.charAt(i)>=97&&newstr.charAt(i)<=127) {
				newstr.setCharAt(i,Character.toLowerCase(newstr.charAt(i)));
			}
			else if(newstr.charAt(i)==' ')
				newstr.replace(i,i+1,"*");
			else
			newstr.replace(i,i+1,":");
		}
		System.out.print(newstr);
		}
	}



