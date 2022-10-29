package 面向对象;

import java.util.Scanner;

//1.图书馆接口
interface Library{
	//成员方法
	public void borrow();	//借阅图书
	public void revert();	//归还图书
}
//2.图书类
class Book{
	//成员变量
	private String name;		//图书名称
	private String publisher;	//出版社
	
	//构造方法
		//通过形参初始化图书名称（name）和出版社（publisher）
	public Book(String name,String publisher) {
		this.name=name;
		this.publisher=publisher;
	}
	//普通方法
		//1.设置gettor和settor方法用于获取和设置类中name变量的值；
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
		//2.重写Equals方法，当且仅当书名（name)和出版社(publisher) 均相等时，即为同一本书。
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((publisher == null) ? 0 : publisher.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (publisher == null) {
			if (other.publisher != null)
				return false;
		} else if (!publisher.equals(other.publisher))
			return false;
		return true;
	}
		//3.重写toString方法，返回书名（name)和出版社(publisher)的信息，样式如下：“书名：Java程序设计，出版社：清华大学出版社”
	@Override
	public String toString() {
		return "书名:"+this.name+"  出版社:"+this.publisher;
	}
}
//3.馆藏图书类（CollectionBook），继承自Book类，实现Library接口
class CollectionBook extends Book implements Library{
	//成员变量
	private String bNo;		//图书编号
	private String stacks;	//所在书库
	private boolean isBorrow;		//是否借阅
	//构造方法
	public CollectionBook(String name, String publisher,String bNo,String stacks) {
		super(name, publisher);
		this.bNo=bNo;
		this.stacks= stacks;
		// TODO Auto-generated constructor stub
	}
	//普通方法
		//1.实现接口中的borrow方法
	@Override
	
	public void borrow() {
		// TODO Auto-generated method stub
		if (isBorrow==true)System.out.println("对不起，该图书已借阅");
		else System.out.println("借阅成功");
	}
		//2.实现接口中的revert方法
	@Override
	public void revert() {
		// TODO Auto-generated method stub
		if (isBorrow==false)System.out.println("还书成功");
		else System.out.println("该图书已归还");
	}
}

public class jikebook {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionBook book1 = new CollectionBook("《海底两万里》", "清华出版社", "00123", "一号书库");
		CollectionBook book2 = new CollectionBook("《天上人间》", "浙江出版社", "12300", "五号书库");
		if (book1.equals(book2)==true) System.out.println("这两个对象相等");
		else System.out.println("这两个对象不相等");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入整数(0或者1)");
		while (sc.hasNext()) {
		int x= sc.nextInt();
		if (x==0) {
			book1.borrow();
		}
		if (x==1) {
			book1.revert();
		}
		}
	}

}
