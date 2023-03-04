
public class NumberIncrementPattern {

	public static void main(String[] args) {
		int value=1;
		for(int row=1;row<5;row++)
		{
			for(int col=1;col<row;col++)
			{
				System.out.print(value);
		value++;
			}
			System.out.println();
		}

	}

}
