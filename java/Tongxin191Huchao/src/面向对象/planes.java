package 面向对象;

class Plane{
	private String pName;
	private String pModel;
	private int pWeight;
	private double speed;
	
	//构造方法一
	public Plane(String pName) {
		this.pName = pName;
	}
	//构造方法二
	public Plane(String pName,String pModel,int pWeight, double speed) {
		this(pName);
		this.pModel = pModel;
		this.pWeight = pWeight;
		this.speed = speed;
	}
	//普通方法
	//返回飞机型号
	public String getpModel() {
		return pModel;
	}
	public void setpModel(String pModel) {
		this.pModel = pModel;
	}
	//用于输出所有成员变量的值
	public void show(){
		System.out.println("飞机名称:"+pName);
		System.out.println("飞机型号:"+pModel);
		System.out.println("飞机自重:"+pWeight+"吨");
		System.out.println("飞机速度:"+speed+"公里每小时");
	}
	//加速
	public void speedUp(int s2) {
		this.speed+=s2;
		System.out.println("加速"+s2+",速度为:"+speed+"公里每小时");
	}
	//减速
	public void speedDown(int s1) {
		this.speed-=s1;
	System.out.println("减速:"+s1+",速度为:"+speed+"公里每小时");
	}
	//比较两个对象是否相等
	public void compare(Plane plane) {
	if (this.pWeight==plane.pWeight&&this.speed==plane.speed)System.out.println("这两个对象相等");
	else System.out.println("这两个飞机不相等");
	}
	
}
public class planes {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plane plane1 = new Plane("客机","波音747",200,700);
		Plane plane2 = new Plane("直升机","武直9",80,150);
		plane1.compare(plane2);
		plane1.show();
		plane1.speedDown(10);
		plane1.speedUp(20);
		plane2.show();
		plane2.speedDown(10);
		plane2.speedUp(20);
	}
}
