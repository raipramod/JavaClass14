package day17;

public class ThreadDemo4 extends Thread {
	
	public void run() {
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getState());
		
	}
	
	public static void main(String[] args) {
		ThreadDemo4 t1 = new ThreadDemo4();
		ThreadDemo4 t2 = new ThreadDemo4();
		ThreadDemo4 t3 = new ThreadDemo4();
		t1.start();
		t2.start();
		t3.start();
		
	}

}
