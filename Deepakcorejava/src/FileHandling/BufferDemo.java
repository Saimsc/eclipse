package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("C:\\\\\\\\Users\\\\\\\\SAI CHAITANYA\\\\\\\\OneDrive\\\\\\\\Documents\\\\\\\\Deepak.txt");
		BufferedReader br =new BufferedReader(fr);
		
		String line = br.readLine();
		 while(line!=null) {
			System.out.println(line);
			line=br.readLine();
		}
	}

}


