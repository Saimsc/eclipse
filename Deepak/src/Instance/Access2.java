package Instance;

public class Access2 {
	void m1() {
		Access1 a=new Access1();
		System.out.println(Access1.y);
		a.m2();
	}

	public static void main(String[] args) {
	Access2 a=new Access2();
	a.m1();

	}

}
