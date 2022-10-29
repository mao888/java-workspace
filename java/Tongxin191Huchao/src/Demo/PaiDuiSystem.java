package Demo;
/**
* ʳ���Ŷ����� --�����ߺ������ߵĹ�ϵ
* @author ����
*
*/
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.internal.runners.statements.FailOnTimeout;

class food{
	private int id;
	//���ι��캯��u�������ò����޲ι����������Կ��Բ�д�������½����󽫻������
	public food(int id) {
		this.id=id;
	}
	//get set ����
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
}

//������
class Producer implements Runnable{
	private boolean working = true;
	private BlockingQueue<food> queue;			//����ϵķ�ʽ������һ��BlockingQueue
	private static AtomicInteger count = new AtomicInteger();
	
	//���캯��
	public Producer(BlockingQueue<food> queue) {
		// TODO Auto-generated constructor stub
		this.queue = queue;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (working) {
			int id = count.incrementAndGet();
			food Food = new food(id);
			System.out.println(Thread.currentThread().getId()+"��Ա����ʼ����");
			if (queue.offer(Food)) {
				System.out.println(Thread.currentThread().getId()+"��Ա����"+Food.getId()+"��ʳ������̨");
			}else {
				System.out.println("��̨������"+Food.getId()+"�������޷�����");
			}
			try {
				Thread.sleep((int)(Math.random()*1000*3));
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
	public void stop(){
		working=false;
	}
}

//��������
class consumer implements Runnable{
	private boolean flag = true;
	private BlockingQueue<food> queue;
	//���캯��
	public consumer(BlockingQueue<food>queue) {
		// TODO Auto-generated constructor stub
		this.queue=queue;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			try {
				food Food = queue.take();	//take()��ʽ����������û��Ԫ�����̱߳�����
				System.out.println(Food.getId()+"��ʳ���ѱ�"+Thread.currentThread().getId()+"�Ź˿Ͷ���");
				Thread.sleep(1000*2);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
}
public class PaiDuiSystem {
	public static void main(String[] args) {
	BlockingQueue<food> queue = new LinkedBlockingDeque<>(10);
	Producer []p1= new Producer[3];
	consumer []c1 = new consumer[15];
	for (int i = 0; i < 3; i++) {
		p1[i] = new Producer(queue);
	}
	for (int j = 0; j < 15; j++) {
		c1[j] = new consumer(queue);
	}
	ExecutorService executorService = Executors.newFixedThreadPool(5);
	for (int i = 0; i < 3; i++) {
		executorService.execute(p1[i]);
	}
	for (int j = 0; j < 15; j++) {
		executorService.execute(c1[j]);
	}
	try {
		Thread.sleep(1000*20);
	} catch (InterruptedException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	}
}
