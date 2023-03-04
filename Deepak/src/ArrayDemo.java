
public class ArrayDemo {

	public static void main(String[] args) {
		int arr[] [] = {{3,4,5,6,7},{7,8,9,1,3},{6,5,4,4}};
		for(int[] x:arr) {
		for(int y:x) {
System.out.println(y+"");
	}
System.out.println();
}
}
}