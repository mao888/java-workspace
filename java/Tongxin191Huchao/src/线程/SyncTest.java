package 线程;

import javax.swing.plaf.SliderUI;

public class SyncTest implements Runnable {
	Timer timer = new Timer();
	public static void main(String[] args) {
		
	SyncTest test = new SyncTest();
	Thread t1 = new Thread(test);
	Thread t2 = new Thread(test);
	t1.setName("t1");
	t2.setName("t2");
	t1.start();
	t2.start();
	
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		timer.add(Thread.currentThread().getName());
	}

}

class Timer{
	private static int num =0;
	public synchronized void add(String name) {		//synchronized执行这个方法的过程中当前对象被锁定
//		synchronized(this) {	//互斥锁  锁定当前对象  一个线程执行的过程中不会被另外一个线程打断
		num++;
		try {
			Thread.sleep(1); 
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println(name+",你是第"+num+"个使用timer的线程");
//		}
	}
}



