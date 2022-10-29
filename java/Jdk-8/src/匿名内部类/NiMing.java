package 匿名内部类;
/*
 * 
 * 什么是匿名内部类？	
	匿名内部类，顾名思义，就是不知道这个类到底是什么名字，也就是不知道类名。
   匿名内部类的使用场景？
	匿名内部类适合创建那种只需要使用一次的类，也就是说创建一个匿名内部类，只需要用一次即可。
 * */

interface Product{
	 double getPrice();
	 String getName();
}
	 
class Anony{
	public void test(Product product){
	System.out.println("购买了一个"+product.getName()+"，花掉了"+product.getPrice());
	}
}

/*
 * 
 * new 类名(参数) | 实现接口()
{
// 匿名内部类的类体部分
}
从上面的定义可以看出，匿名内部类必须继承一个父类，或实现一个接口，但最多只能继承一个父类，或者实现一个接口。
两个规则：
	匿名内部类不能是抽象类。
	匿名内部类不能定义构造器。由于匿名内部类没有类名，所以无法定义构造器，但匿名内部类可以初始化块，可以通过初始化块来完成构造器需要完成的工作。

 * */
public class NiMing {
	public static void main(String[] args){
		Anony anony=new Anony();
		// 注意，此处要传入一个匿名类对象
		anony.test(new Product(){
			@Override
			public double getPrice(){
					return 578.6;
				}
			@Override
			public String getName(){
					return "联想笔记本";
				}
			}
		);
		
	}

}


