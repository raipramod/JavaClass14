package day14;

import java.io.File;

public class FileDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String pathName = "Users/admin/Desktop/demo2.txt";
		File file = new File(pathName);
		
		System.out.println(file.getName());
		System.out.println(file.getParent());
		System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.isHidden());
		
		System.out.println(file.canWrite());
		System.out.println(file.canExecute());
		System.out.println(file.canRead());
		file.setWritable(false);
		
		pathName = "Users/admin/Desktop/demo2.txt";
		File file1 = new File (pathName);
		file1.delete();
		
		
	}

}
