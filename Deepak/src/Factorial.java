
public class Factorial {
	int Fact(int n) {
		if(n==1)
			return 1;
		int x=n*Fact(n-1);
		return x;
		
	}

	public static void main(String[] args) {
		Factorial f=new Factorial();
		int result=f.Fact(4);
		System.out.println(result);

	}

}
