package 线程;

//class Runner1 implements Runnable{	//法一:继承接口
	class Runner1 extends Thread{
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Runner1"+i);
		}
	}
}


public class ThreadTest1 {
	public static void main(String[] args) {
		Runner1 r = new Runner1();
		r.start();    //法二
//		Thread t = new Thread(r);	
//		t.start();	//线程启动   并行交替执行
		r.run();    //方法调用  子线程执行完  再执行主线程
		
		for (int i = 0; i < 100; i++) {
			System.out.println("Main Thread:-----"+i);
		}
	}
}
