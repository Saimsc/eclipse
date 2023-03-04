package FileHandling;
import java.io.FileOutputStream;
import java.io.IOException;
public class WriteDemo {
public static void main(String[] args) throws IOException {
		
		FileOutputStream output = new FileOutputStream("C:\\Users\\SAI CHAITANYA\\OneDrive\\Documents\\Deepak.txt");
		
		String s = "Hello world";
		//converted into bytes
		byte[] b=s.getBytes();
		
		output.write(b);
		output.close();
	}

}
