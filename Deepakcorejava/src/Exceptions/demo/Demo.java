package Exceptions.demo;

public class Demo {

	public static void main(String[] args) {
		
		int a[] = {2,5,6,7,8};
		int sum = 0;
		try {
for(int i=0;i<=a.length;i++) {//here "i" means index position same for all programs,length=5,index=0,1,2,3,4
	System.out.println(i+" "+a[i]);
	sum += a[i];
}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("exception occured");
		}
		System.out.println("sum of array elements:"+sum);
		
		String str="123";
		int i= Integer.parseInt(str);
		System.out.println("i=" + i);
		
		String s="hello";
		try {
	System.out.println(s.charAt(12));
		}catch(StringIndexOutOfBoundsException f) {
			System.err.println("string exception occurred");
		}
		
		
			String s1 = null;
			try {
			s1 = s1.concat("hello");
		}catch(NullPointerException n) {
			System.err.print("null exception");
	//System.out.println("null exception");
		}
		}

}
