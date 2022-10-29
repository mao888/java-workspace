package 线程;

public class TTtest implements Runnable {
	//问2:b打印结果 1.无条件，main必先执行，新线程需要准备 2.main和新线程的业务情况
	
	// 问题1 synchronized 互斥锁
	// 1. aT,bT 必须执行同一个方法
	// 2. 这个方 必须有synchronized修饰

	// 问3:数据库里的某一条记录，对象 我可以修改和读 读和改的方法的方法 哪个该加synchronized 为什么还会影响效率\
	// 不会 mysql 人家是有加锁的。
	//  
	int b = 100;

	public synchronized void m1() throws Exception { // 问题1:当此方法执行的过程中 m2方法能够被执行吗
		//		b = 1000; // 是否要等到解锁后才能执行呢
		Thread.sleep(2000);
		System.out.println(Thread.currentThread().getName() + " " + 2);
	}

	public synchronized void m2() throws Exception {
		Thread.sleep(2500);
//		System.out.println(b);
		b = 2000;
		System.out.println(1);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			m1();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		TTtest tt = new TTtest();
		Thread t = new Thread(tt);
		t.start();		// t 线程去 执行的m1 m1拥有互斥锁
		tt.m1();		// main 线程执行的m1	
//		System.out.println(tt.b);
		// 问3:数据库里的某一条记录，对象 我可以修改和读 读和改的方法的方法 哪个该加synchronized 为什么还会影响效率

		// java 在你没有启用自定义线程。 main线程，管理主方法的运行。
		// Thread.sleep(n) 这个方法究竟是让那个线程去睡眠。
	}
}
