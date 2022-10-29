package 泛型与容器;

import java.util.HashMap;
import java.util.Map;

public class map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m1 = new HashMap();Map m2 = new HashMap();
		
		//在合适的时机自动打包，解包
			//自动将基础类型转换为对象
			//自动将对象转换为基础类型
		
		//map规定两边都必须是对象
//		m1.put("one", new Integer(1));//以key为键，向集合中添加值为value的元素，其中key必须唯一，否则新添加的值会取代已有的值
		m1.put("one",1 );
//		m1.put("two", new Integer(2));
		m1.put("two",2 );
//		m1.put("three", new Integer(3));
		m1.put("three", 3);
//		m2.put("A", new Integer(1));
		m2.put("A", 1);
//		m2.put("B", new Integer(2));
		m2.put("B", 2);
		
		System.out.println(m1.size());//返回次映射中的键值映射关系数
		
		System.out.println(m1.containsKey("one"));  //判断是否包含指定的键key
		
//		System.out.println(m1.containsValue(new Integer(1))); 	//判断是否包含指定的值value
		System.out.println(m2.containsValue(1));
		
		//get返回键key所映射的值，若key不存在则返回null
		if (m1.containsKey("two")) {
//			int i=((Integer)m1.get("two")).intValue();
			int i = (Integer) m1.get("two");
			System.out.println(i);
		}
		
		//将映射m中的所有映射关系复制到调用此方法的映射中
		Map m3= new HashMap(m1);
		m3.putAll(m2);
		System.out.println(m3);
		
	}

}
