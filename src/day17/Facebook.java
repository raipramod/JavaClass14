package day17;

public class Facebook {
	private int likes;
	
	public Facebook(int likes) {
		this.likes = likes;
	}
	
	public void incrementLikes() {
		
		try {
			likes++;
			Thread.sleep(2000);
			System.out.println(likes);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	

}
