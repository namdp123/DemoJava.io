package demowriter;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		    // Tạo đối tượng luồng và liên kết nguồn dữ liệu
		    FileInputStream fis = new FileInputStream("E:\\output.txt");
		    ObjectInputStream ois = new ObjectInputStream(fis);

		    // Đọc dữ liệu
		    Stock sArr[] = (Stock[]) ois.readObject();
		    for(Stock s : sArr){
		      System.out.println(s.toString());
		    }
		    
		    //Đóng luồng
		    fis.close();
		    ois.close();
		  } catch (Exception ex) {
		    System.out.println("Loi doc file: "+ex);
		 }

	}

}
