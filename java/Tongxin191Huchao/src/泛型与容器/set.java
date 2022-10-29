package 泛型与容器;

import java.util.HashSet;
import java.util.Set;

public class set {
	public static void main(String[] args) {
		Set s1 = new HashSet();
		Set s2 = new HashSet();
		s1.add("a");s1.add("b");s1.add("c");
		s2.add("a");s2.add("b");s2.add("d");
		//构造方法用以初始化容器类
		Set sn = new HashSet(s1);
		sn.retainAll(s2);
		System.out.println(sn);
		
//		s1.retainAll(s2);
//		System.out.println(s1);
		Set su = new HashSet(s1);
		su.addAll(s2);
		System.out.println(su);
//		String a = "1";
//		String b = "1";
//		System.out.println(a.equals(b));
////		
//		String c = "2";
//		String s = new String();
//		s="2";
//		String n = new String("2");
		
		//哈希集合是在元素的的存储位置和元素的值k之间建立一个特定的对应关系f，使每个元素与一个唯一的存储位置想对应。
		//在比较两个加入哈希集合HashSet中的元素是否相同时，会先比较哈西码方法hashCode()的返回值是否相同，若相同，则再使用equals()方法比较其存储位置（即内存地址）
		//若两者都相同，则视为相同的元素。之所以在比较了哈西码之后，还要通过equals（）方法进行比较，是因为对不同元素计算出的哈西码可能相同。
		//因此，对于哈希集合来说，若重写了元素对应类的equals（）方法或hashcode（）方法中的某一个，则必须重写另一个，以保证其判断的一致性
	
	}
}








