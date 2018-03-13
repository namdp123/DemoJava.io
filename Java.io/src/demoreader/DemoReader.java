package demoreader;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream in = new FileInputStream("E:\\input.txt");
		
		int a = in.read();
		in.close();
		System.out.println("Ca dao tuc ngu: "+a);
		
		
	}

}
