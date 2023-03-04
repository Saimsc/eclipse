
public class StringDemo {
	
public static void main(String[]args) {
	
	String s1 = new String("Hello sai");
	
	String s2= "welcome to world";
	
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s1.concat(s2));
	System.out.println(s2.concat(s1));
	System.out.println(s1.codePointAt(2));
	System.out.println(s1.compareToIgnoreCase(s2));
	System.out.println(s1.toUpperCase());
}
	
	
}