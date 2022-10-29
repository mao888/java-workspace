package 面向对象;

class Plane1{
	private String pName;
	private String pModel;
	private int pWeight;
	//构造方法1
	public Plane1(String pName){
		this.pName = pName;
	}
	//构造方法2
	public Plane1(String pName,String pModel,int pWeight){
		this(pName);
		this.pModel=pModel;
		this.pWeight=pWeight;
	}
	//普通方法
	//返回飞机型号
	public String getPModel() {
		return pModel;
	}
	//覆盖equals方法
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plane1 other = (Plane1) obj;
		if (pModel == null) {
			if (other.pModel != null)
				return false;
		} else if (!pModel.equals(other.pModel))
			return false;
		return true;
	}
	//覆盖toString
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "飞机名称:  "+this.pName+"飞机型号:  "+this.pModel;
	}
}
//飞行器接口
interface Aerocraft{
	//成员方法
	public String takeofWay();
	public String mainUsage();
}
//民航客机类
class Airliner extends Plane1 implements Aerocraft{
	//成员变量
	private int seat;
	//构造方法
	public Airliner(String name, String model, int weight,int seat) {
		super(name, model, weight);
		this.seat = seat;
		// TODO Auto-generated constructor stub
	}
	//普通方法
	@Override
	//重写takeOfway
	public String mainUsage() {
//		 TODO Auto-generated method stub
		return "客运";
	}
	@Override
	//重写mainUsage
	public String takeofWay() {
		// TODO Auto-generated method stub
		return "跑道起飞";
	}
}
public class jikeplane {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plane1 plane1=new Plane1("雷雨", "Y192", 100);
		Plane1 plane2 = new Plane1("雷霆", "N759", 120);
//		System.out.println(plane1.equals(plane2));
		if (plane1.equals(plane2)==true)System.out.println("这两个对象相等");
		else System.out.println("这两个对象不相等");
		System.out.println(plane1.toString());
		Airliner airliner = new Airliner("海燕", "K468", 15, 1);
		System.out.println("起飞方式为:"+airliner.takeofWay());
		System.out.println("主要用途:"+airliner.mainUsage());
	}
}
