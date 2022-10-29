package 字节春招笔试第4场;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 模糊回文 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(MOhuPipei(s));
	}
	public static boolean MOhuPipei(String s) {
		char c[] = s.toCharArray();
		List list = new ArrayList<>();
		List list2 = new ArrayList<>();
		int zimu = 0;
		int feizimu = 0;
//		for (int i = 0; i < c.length; i++) {
//			list.add(c[i]);
//		}
		
		// 将所有字母存入list
		for (int i = 0; i < c.length; i++) {
			if (c[i]>='a'&&c[i]<='z' || c[i]>='A'&&c[i]<='Z') {
				list.add(c[i]);
			}
		}
		
		// 删除字母
		zimu = list.size();
		if (zimu%2==0) {
			list.removeAll(list);
		}else {
			for (int i = 0; i < list.size()-1; i++) {
				list.remove(i);
			}
		}
		
		// 将所有非字母存入list
		for (int i = 0; i < c.length; i++) {
			if (!(c[i]>='a'&&c[i]<='z' || c[i]>='A'&&c[i]<='Z')) {
				list2.add(c[i]);
			}
		}
		
		// 删除非字母
		feizimu = list2.size();
		if (feizimu%2==0) {
			list.remove(list);
		}else {
			for (int i = 0; i < list.size()-1; i++) {
				list2.remove(i);
			}
		}
		// 最后判断
		if (list.size()!=0) {
			if (list2.size()==0) {
				return true;
			}
			else {
				return false;
			}
		}else {
			return true;
		}
	}

}
