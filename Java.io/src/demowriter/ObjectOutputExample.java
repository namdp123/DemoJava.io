package demowriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		    //Tạo đối tượng luồng và liên kết nguồn dữ liệu
		    FileOutputStream fos = new FileOutputStream("E:\\output.txt");
		    ObjectOutputStream oos = new ObjectOutputStream(fos);
		    //Khai báo mảng
		    Stock s[] = {
		     new Stock(1, "CD ROM", 100.1, 2)
		    ,new Stock(2, "CPU", 500.0, 2)
		    ,new Stock(3, "HP Scanner", 75.0, 1)
		    };
		   //Ghi mảng đối tượng vào file
		   oos.writeObject(s);

		   //Đóng luồng
		   oos.close();
		   fos.close();
		   
		 } catch (IOException ex) {
		   System.out.println("Loi ghi file: "+ex);
		 }

	}

}
