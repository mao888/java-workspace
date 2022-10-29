package 线程;

import java.util.Date;
//import org.omg.CORBA.DATA_CONVERSION;

/*
public enum State {
   NEW,
   RUNNABLE,
   BLOCKED,
   WAITING,
   TIMED_WAITING,
   TERMINATED;
}
*/
public class ThreadTest2 {
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
		try {
			Thread.sleep(10000);
			thread.interrupt();	
			
			// java的线程转态 4 5
			// java的推荐中断，停止，唤醒
			// java不推荐使用的方法
			// java垃圾回收对线程影响（拓展）
		
		} catch (InterruptedException e) {
			// TODO: handle exception
			 //中断线程
		}
	}
}

class MyThread extends Thread{
	boolean flag = true;
	public void run() {
		while (flag) {
			System.out.println("==="+new Date()+"===");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				return;
			}
		}
	}
}