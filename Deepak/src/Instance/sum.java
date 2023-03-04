package Instance;
    import java.util.Scanner;
    public class sum {

	public static void main(String[] args) {
	 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter thre ");
		int num= sc.nextInt();
		int sum=0;
		int start=1;
		while(start<=num) {
			if(num%start==0) {
				sum=sum+start;
				
			}
			start++;
		}
		System.out.println(sum);
	 
		}

	}
