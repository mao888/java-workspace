package 泛型与容器;

import java.security.cert.CollectionCertStoreParameters;
import java.util.*;

//import java.util.LinkedList;

public class list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//list方法举例
		List l1 = new LinkedList();

		
		for (int i = 0; i<=5; i++) {
			l1.add("a"+i);
		}
		System.out.println(l1);
		l1.add(3, "a100");		//在index位置插入元素element
		System.out.println(l1);
		l1.set(6, "a200");		//用element取代index位置的元素
		System.out.println(l1);			
		System.out.print(l1.get(2)+" ");	//get返回列表中指定位置的元素
		System.out.println(l1.indexOf("a3"));//indexof返回元素o首次出现的序号，若o不存在返回-1
		System.out.println(l1.indexOf("0"));
		l1.remove(1);	//在列表中删除index位置的元素
		System.out.println(l1);
		
		System.out.println("========================================");
		//list常用算法
		System.out.println("list常用算法");
		
		
		List l2 = new LinkedList();
		LinkedList l3 = new LinkedList();
		
		for (int i = 0; i <=9; i++) {l2.add("a"+i);}
		System.out.println(l2);
		Collections.shuffle(l2);//随机排序
		System.out.println(l2+"随机排序");
		
		Collections.reverse(l2);
		System.out.println(l2+"逆序");//逆序
		
		l2.sort(null);				//排序
		System.out.println(l2);
		Collections.sort(l2);
		System.out.println(l2+"排序");
		
	}
}
