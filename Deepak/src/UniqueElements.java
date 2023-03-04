import java.util.Scanner;
public class UniqueElements {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size");
      int size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("enter the inputs");
      for(int i=0;i<a.length;i++)
      {
    	  a[i]=sc.nextInt();
      }
      System.out.println("unique elements are:");
      for(int i=0;i<a.length;i++)
      {
    	  int count=0;
    	  for(int j=0;j<a.length;j++)
    	  {
          if(a[i]==a[j])
          {
        	  count++;
          }
    	  }
    	  if(count==1)
    	  {
    		  System.out.println(a[i]);
          }
      }

	}

}
