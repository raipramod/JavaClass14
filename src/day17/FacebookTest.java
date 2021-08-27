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

		Thread user2 = new Thread (new Runnable(){
			@Override
			public void run() {
				fb.incrementLikes();
			}
			
			
		});

		Thread user3 = new Thread (new Runnable(){
			@Override
			public void run() {
				fb.incrementLikes();
			}
			
			Thread user4 = new Thread (new Runnable(){
				@Override
				public void run() {
					fb.incrementLikes();
				}
				
				
			});

			
			
		});
		
		user1.start();
		user2.start();
		user3.start();
		//user4.start();
		//user4.start();
		
		

	}

}
