package day14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String rPathName = "Users/admin/Desktop/demo3.txt";
		String wPathName = "Users/admin/Desktop/demo4.txt";
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(rPathName);
			fos = new FileOutputStream(wPathName);
			int len;
			while(len =fis.read())!= -1){
				System.out.println(len);
				fos.write(len);
			}
		}catch(FileFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				fos.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
