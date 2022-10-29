package 泛型与容器;

public class fanxingTest<T>			//定义泛型类，T是参数类型   相当于是类的“类型形式参数”
{								
	private static final String Integer = null;
//因类型参数所表示的数据类型不是固定的，所以T可代表任意一种数据类型				
	private T obj;				//用该T类型来声明类成员变量

	/**
	 * @return the obj
	 */
	public T getObj() {			 	//定义泛型类的方法getObj()			
		return obj;					//用该类型来声明该方法的返回值
	}

	/**
	 * @param obj the obj to set
	 */
	public void setObj(T obj) {		//定义泛型类的方法setobj()   用该T类型声明成员方法的参数
		this.obj = obj;				
	}
	
	@Override
	public String toString() {
		return " [" + obj + "]";
	}

	public static void main(String[] args) {
		fanxingTest<String> name = new fanxingTest<String>();	//使用泛型类fanxingTest<String>创建泛型对象name时，则是使用String来代替类型参数T
		fanxingTest<Integer> age = new fanxingTest<Integer>();	//创建Integer型对象
		//name
		name.setObj("胡超");
		String getname = name.getObj();
		System.out.println("姓名:"+getname);
		//age
		age.setObj(20);
		int getage = age.getObj();
		System.out.println("年龄:"+getage);
		
		Integer [] num = {1,2,3,4,5};	//定义数组
		fanxingTest.display(num);;
		
		String str[]= {"红","橙","黄","绿","青","蓝","紫"};
		fanxingTest.display(str);
		
	}
	
	
//	public static void main(String[] args) {
//		fanxingTest fan = new fanxingTest();
//		int i =1;
//		fan.add(i);
//		fan.adsd(i);
//		int[] is = {1};
//		Integer[] is2 = {1};
//		fan.adsd(is2);
//		fan.adsd(is);
//	}
//	public  <H> void adsd(H[] a){
//		System.err.println(a);
//	}
//	
//	public  <H> void adsd(H a){
//		System.err.println(a);
//	}
//	
//	public void add(Object a) {
//		
//		System.out.println(a);
//	}
	
	public static<E> void display(E[] arr) 	//定义泛型方法,E为参数类型
	{
		for (int i = 0; i < arr.length; i++)System.out.print(arr[i]+" ");
		System.err.println();
	}
}

