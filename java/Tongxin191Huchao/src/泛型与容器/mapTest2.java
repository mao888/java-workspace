package 泛型与容器;

import java.util.HashMap;
import java.util.Map;

public class mapTest2 {
	public static void main(String[] args) {
		Map<String, Integer> m1= new HashMap<String, Integer>();
		m1.put("one", 1);
		m1.put("two", 2);
		m1.put("three", 3);
		
		System.out.println(m1.size());
		System.out.println(m1.containsKey("one"));
		
		if (m1.containsKey("two")) {
			int i = m1.get("two");	//get("two")拿出来的是Integer对象类型，不用强制类型转换，然后自动解包，int i这种基础类型         
			System.out.println(i);
		}
	}
}
