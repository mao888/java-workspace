package 泛型与容器;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/*
 *
 *泛型其实质就是将数据的类型参数化，通过为类，接口及方法设置类型参数来定义泛型
 *泛型使一个类或一个方法可在多种不同类型的对象上进行操作，运用泛型意味着编写的代码可以被很多类型不同的对象所重用，从而减少数据类型转换的潜在错误
 *泛型实际上是在定义类，接口或方法时通过为其增加"类型参数"来实现的
 		*即泛型所操作的数据类型被指定为一个参数，这个参数称为类型参数
    	实质	*所以说，泛型的实质是将数据的类型参数化	
*/
 
public class 泛型 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> c= new ArrayList<String>();
		c.add("aaa");c.add("bbb");c.add("ccc");
		for (int i = 0; i < c.size(); i++) {
			String s = c.get(i);		//不需要强制转换 
			System.out.println(s);
		}
		 
		Collection<String> c2 = new	HashSet<String>();
		c2.add("aaa");c2.add("bbb");c2.add("ccc");
		for (Iterator<String> it  =c2.iterator();it.hasNext();) {
			String s = it.next();
			System.out.println(s);
			
class MyName implements Comparable<MyName>{
	int age;

	@Override
	public int compareTo(MyName mn) {
		// TODO Auto-generated method stub
		if (this.age>mn.age)return 1;
		else if (this.age<mn.age)return -1;
		else return 0;
	}
	
}	

		}
	}
}
