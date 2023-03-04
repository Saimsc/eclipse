 package FileHandling;
import java.io.FileInputStream;
import java.io.IOException;
public class ReadDemo {
public static void main(String[] args) throws IOException {
		
		FileInputStream input = new FileInputStream("C:\\Users\\SAI CHAITANYA\\OneDrive\\Desktop\\Demo.txt");
      // System.out.println((char)input.read());
		int i= input.read(); //it will read only one character
		while(i !=-1) { //-1 represents end of text file and it is empty file and also nothing to read
			
		
  System.out.print((char)i);/*when we give println it will give output:j
  a
  v
  a
   
  p
  r
  o
  g
  r
  a
  m




  A
  p
  p
  e
  n
  d
  i
  n
  g
   
  d
  a
  t
  a




  A
  p
  p
  e
  n
  d
  i
  n
  g
   
  d
  a
  t
  a




  A
  p
  p
  e
  n
  d
  i
  n
  g
   
  d
  a
  t
  a




  A
  p
  p
  e
  n
  d
  i
  n
  g
   
  d
  a
  t
  a*/

		i=input.read();
			
	}
input.close();
		
	}
}
