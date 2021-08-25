package day17;

public class FileUploadTest {

public static void main(String[] args) {
//		FileUploadThread ft1 = new FileUploadThread("file1");
//		FileUploadThread ft2 = new FileUploadThread("file2");
//		FileUploadThread ft3 = new FileUploadThread("file3");
		
	
		FileUploadThreaad ft1 = new FileUploadThread("file1");
		FileUploadThread ft2 = new FileUploadThread("file2");
		FileUploadThread ft3 = new FileUploadThread("file3");
		
		
		
		
		//FileUploadThread		
		
		ft1.start();
		ft2.start();
		ft3.start();

	}	

}
