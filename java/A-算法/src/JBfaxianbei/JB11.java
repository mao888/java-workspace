package JBfaxianbei;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

//哈希数表（Hash table，也叫哈希表），是根据关键码值(Key value)而直接进行访问的数据结构。也就是说，它通过把关键码值映射到表中一个位置来访问记录，以加快查找的速度。这个映射函数叫做散列函数，存放记录的数组叫做散列表。
//给定表M，存在函数f(key)，对任意给定的关键字值key，代入函数后若能得到包含该关键字的记录在表中的地址，则称表M为哈希(Hash）表，函数f(key)为哈希(Hash) 函数。

public class JB11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new Scanner(System.in).nextLine();

		Map<Character,Integer> m=new HashMap<Character,Integer>();

		for(int i=0;i<s.length();i++){

			//每个字符(key)及出现次数(value)存入HashMap

			char c=s.charAt(i);

			m.put(c,m.containsKey(c)?m.get(c)+1:1);

		}

		int max=Collections.max(m.values());

		Set<Character> v=new HashSet<Character>();

		for(Map.Entry<Character,Integer> e:m.entrySet())

			if(e.getValue()==max) v.add(e.getKey());

		System.out.println(v+"times"+max);
	}

}
