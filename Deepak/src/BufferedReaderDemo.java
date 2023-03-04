import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {

	public static void main(String[] args) 
		throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter 1st number:");
int x=Integer.parseInt(br.readLine());
System.out.println("Enter 2nd number:");
int y=Integer.parseInt(br.readLine());
System.out.println("sum is:"+(x+y));
	}

}
