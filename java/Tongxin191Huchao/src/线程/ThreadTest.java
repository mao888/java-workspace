package 线程;

public class ThreadTest extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+" =====");
	}
	
	public static void main(String[] args) throws InterruptedException {
		ThreadTest tt = new ThreadTest();
		tt.setName("tt线程");
		System.out.println(Thread.currentThread().getName()+" =====");
//		tt.run();
		tt.start();
		Thread.sleep(50);
		System.out.println(Thread.currentThread().getName()+" =====");
		
		
	}
	
}
