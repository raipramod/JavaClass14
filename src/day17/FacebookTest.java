package day17;

public class FacebookTest {

	public static void main(String[] args) {
		Facebook fb = new Facebook(100);
		
		Thread user1 = new Thread (new Runnable(){
			@Override
			public void run() {
				fb.incrementLikes();
			}
			
			
		});

	}

}
