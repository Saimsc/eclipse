package FileHandling;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class AppendingData {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream output = new FileOutputStream("C:\\\\Users\\\\SAI CHAITANYA\\\\OneDrive\\\\Documents\\\\Deepak.txt" ,true);
				
		String s= "\n\nAppending data";

		output.write(s.getBytes());

		output.close();

			}
}
