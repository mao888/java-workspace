package 面向对象;

//定义抽象的存储类
abstract class Storage{
	protected String brand;
	protected String type;
	protected String owner;
	private static int num;
	//构造方法一
	public Storage(String xm){
		brand = xm;
	}
	//构造方法二
	public Storage(String xm,String type,String owner,int num) {
		this(xm);
		this.type=type;
		this.owner=owner;
		this.num = num;
	}
	//普通方法
	// 返回型号
	abstract public String getType();	//声明抽象方法
	//输出所有成员变量的值
	abstract public void show();		//声明抽象方法
	//比较两个对象是否相等
	abstract public void compare(Storage stor);		// 声明抽象方法
	//静态方法
	//用于输出创建的对象个数
	public static void count() {
		System.out.println("创建的对象个数:"+num);
	}
}

//定义继承自Storage的子类compute
class compute extends Storage {
	//构造方法
	public compute(String xm, String type, String owner, int num) {
		super(xm, type, owner, num);
		// TODO Auto-generated constructor stub
	}
	//构造方法
	public compute(String xm) {
		super(xm);
		// TODO Auto-generated constructor stub
	}
	//实现抽象类中的getType方法
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return brand;
	}
	//实现抽象类重的show方法
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("品牌:"+brand);
		System.out.println("型号:"+type);
		System.out.println("所有者:"+owner);
	}
	//实现抽象类中的compare方法
	public void compare(Storage stor) {
		// TODO Auto-generated method stub
		if (this.owner == stor.owner)System.out.println("这两个对象相等");
		else System.out.println("这两个对象不相等");
	}
};

//定义主类
public class computer {
	public static void main(String[] args) {
		Storage stor1 = new compute("神州","STDR2000307","20191544119胡超",1);		//声明父类对象stor1,指向子类对象
		Storage stor2 = new compute("华硕","STDR2000308","20191544118giao凯",2);	//声明父类对象stor2,指向子类对象
		stor1.compare(stor2);
		stor1.show();
		stor2.show();
	}
}