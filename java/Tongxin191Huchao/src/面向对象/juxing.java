package 面向对象;
/**
 * @author Hasee
 *
 */
class Rectangle{
	private double width;
	private double length;
//	构造方法一
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
//	构造方法二
	public Rectangle() {
		this(10,10);
	}
	//普通方法
	//1.1宽
	public double  getWidth() {
		return width;
	}
	public void setWidth(int width) {
		if (width>=20.0||width<=0.0) {
			throw new IllegalArgumentException("width的值应该大于0.0小于20.0");
		}
		this.width = width;
	}
	//1.2长
	public double  getLength() {
		return length;
	}
	public void setLength(int length) {
		if (length>20.0||length<0.0) {
			throw new IllegalArgumentException("length的值应该大于0.0小于20.0");
		}
		this.length = length;
	}
	//2.矩形的面积
	public double area() {
		return width*length;
	}
	//3.矩形的周长
	public double perimeter() {
		return 2*(width+length);
	}
	//4.判断矩形是否为正方形
	public void isSquare() {
		if (this.length==this.width)System.out.println("是正方形");
		else System.out.println("不是正方形");
	}	
	//5.比较两个对象是否相等
	public void campare(Rectangle rect) {
		if (this.width==rect.width&&this.length==rect.length)System.out.println("两个对象相等");
			else System.out.println("两个对象不相等");
	}
	/*
	//重写哈希地址
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(length);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(width);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	//重写对象地址，使其相等
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		if (Double.doubleToLongBits(length) != Double.doubleToLongBits(other.length))
			return false;
		if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
			return false;
		return true;
	}
	*/
	//将地址转化成字符串
	@Override
	public String toString() {
		return "App2 [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
public class juxing {
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(10,10);
		Rectangle rect2 = new Rectangle(10,5);
		System.out.print("rect1的面积为:"+rect1.area()+"   ,周长为:"+rect1.perimeter()+"   rect1");
		rect1.isSquare();
		System.out.print("rect2的面积为:"+rect2.area()+"     ,周长为:"+rect2.perimeter()+"   rect2");
		rect2.isSquare();
		rect1.campare(rect2);
	}
}
