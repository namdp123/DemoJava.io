package demoreader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
            String input = "E:\\input.txt";
            FileInputStream fis = new FileInputStream(new File(input));
            try (BufferedReader br = new BufferedReader(new InputStreamReader(fis))) {
                String line;
                while ((line = br.readLine()) != null) {
                    line = line.trim();
                    if (line != null && !line.isEmpty()) {
                        System.out.println(line);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
