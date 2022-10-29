package 线程;

import org.junit.internal.runners.statements.FailOnTimeout;

public class PriorityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new T1());
		Thread t2 = new Thread(new T2());
		t1.setPriority(Thread.NORM_PRIORITY+3);		//getPriority返回线程的优先级。 
		t1.start();			//NORM_PRIORITY    分配给线程的默认优先级。					
		t2.start();
	}

}

class T1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i < 1000; i++) {
			System.out.println("T1: "+ i);
		}
	}
}

class T2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i < 1000; i++) {
			System.out.println("T2----："+i);
		}
	}
	
}
