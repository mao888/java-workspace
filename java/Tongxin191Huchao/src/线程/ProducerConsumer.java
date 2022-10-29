package 线程;


//import java.util.Math;
//生产者消费者问题
import 泛型与容器.set;

public class ProducerConsumer {
	public static void main(String[] args) {
		SyncStack ss = new SyncStack();
		Producer p1 = new Producer(ss);
		Consumer c1 = new Consumer(ss);
		new Thread(c1).start();
		new Thread(p1).start();
		
		
	}
}

class WoTou{
	int id;
	public WoTou(int id) {
		// TODO Auto-generated constructor stub
	this.id=id;
	}
	@Override
	public String toString() {
		return " "+id;
	}
}

//装馒头的篮子，栈实现
class SyncStack{
	int index=0;
	WoTou[] arrWT = new WoTou[6];
	
	public synchronized void push(WoTou wt) {
		while (index==arrWT.length) {		//当往篮子里装满 停止
			try {
				this.wait();	//wait:当前的正在我这个对象访问的这个线程wait  锁不归自己所有前提:此对象锁住
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		this.notify();		//notify：叫醒一个现在正在wait在某一个对象的线程
		arrWT[index]=wt;
		index++;
		System.out.println("生产了第:"+index+"个窝窝头");
	}
	
	public synchronized WoTou pop() {
		while (index==0) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		this.notify();
		index--;
		System.out.println("消费了第"+index+"窝窝头:");
		return arrWT[index];
	}
}

//生产者 Producer类
class Producer implements Runnable{
	SyncStack ss = null;
	public Producer(SyncStack ss) {
		// TODO Auto-generated constructor stub
		this.ss = ss;
	}
		
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 20; i++) {
			WoTou wt = new WoTou(i);
			ss.push(wt);
//			System.out.println("生产了第:"+wt+"个窝窝头");
		
			try {
				Thread.sleep((int)(Math.random()*10));
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}


//消费者 Consumer类
class Consumer implements Runnable{
	SyncStack ss= null;
	public Consumer(SyncStack ss) {
		// TODO Auto-generated constructor stub
		this.ss=ss;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 20; i++) {
			WoTou wt =ss.pop();
//			System.out.println("消费了第"+wt+"窝窝头:");
			
			try {
				Thread.sleep((int)(Math.random()*10));
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

	}
	
}


