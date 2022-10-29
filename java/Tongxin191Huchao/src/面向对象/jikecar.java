package 面向对象;

//1.交通工具类
class vehicle{
	private String vType;	//	类型
	private int vNum;		// 载客人数
	//构造方法1
	public vehicle() {
		System.out.println("创造了一个交通工具");
	}
	//构造方法2
	public vehicle(String vType,int vNum) {
		this();
		this.vType=vType;
		this.vNum=vNum;
	}
	//普通方法
		//1.get set
	public String getvType() {
		return vType;
	}
	public void setvType(String vType) {
		this.vType = vType;
	}
	public int getvNum() {
		return vNum;
	}
	public void setvNum(int vNum) {
		this.vNum = vNum;
	}
		//2.重写equals方法
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + vNum;
		result = prime * result + ((vType == null) ? 0 : vType.hashCode());
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
		vehicle other = (vehicle) obj;
		if (vNum != other.vNum)
			return false;
		if (vType == null) {
			if (other.vType != null)
				return false;
		} else if (!vType.equals(other.vType))
			return false;
		return true;
	}
		//3.重写tostring
	@Override
	public String toString() {
		return "类型: "+this.vType+"  载客人数: "+this.vNum;
	}
}
//2.计费接口
interface Charge{
	public void billingMethods();
}
//3.公交车类
class Bus extends vehicle implements Charge{
	//成员变量
	private String bNo;
	private String linel;
	//构造方法
	public Bus(String vType, int vNum,String bNo,String linel) {
		super(vType, vNum);
		this.bNo=bNo;
		this.linel=linel;
		// TODO Auto-generated constructor stub
	}
	//普通方法
	//重写billingMethods( )方法
	@Override
	public void billingMethods() {
		// TODO Auto-generated method stub
		System.out.println(getvType()+" "+getvNum()/10+"元/张（不计公里数）");
	}
	//定义showBus（）方法，用于输出Bus对象的所有信息（父类和子类）
	public void showBus() {
		System.out.println("类型:"+getvType()+"  载客人数:"+getvNum()+"  线路号:"+bNo+"  线路:"+linel);
	}	
}
public class jikecar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建两个vehicle对象v1和v2，分别输出v1和v2，并调用其equals方法判断两个对象是否相等；
		vehicle v1 = new vehicle("小型车",20);
		System.out.println(v1.toString());
		vehicle v2 = new vehicle("中型号",50);
		System.out.println(v2.toString());
		if (v1.equals(v2)==true)System.out.println("这两个对象相等");
		else System.out.println("这两个对象不相等");
		//创建一个Bus对象，调用其showBus（）方法和billingMethods( )方法。
		Bus bus =new Bus("公交车", 30, "4路", "科技学院—高铁站");
		bus.showBus();
		bus.billingMethods();
	}
}
