package day17;

public class FileUpload {

	private String name;
	
	public FileUpload(String name) {
		this.name = name;
	}
	
	public void upload() {
		System.out.println(name + " is uploaded.....");
	}
}
