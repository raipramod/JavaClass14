package day14;

import java.io.File;

public class FileDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String pathName = "Users/pramodrai/Desktop/demo1";
		File file = new File (pathName);
		if (file.mkdir()) {
			System.out.println("directory created....");
		}else {
			System.out.println("file already created...");
		}

	}

}
