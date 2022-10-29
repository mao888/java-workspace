package 真题2019;

import java.util.HashSet;
import java.util.Scanner;

public class 不同子串1星 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		HashSet<String> set = new HashSet<String>();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j <= s.length(); j++) {
				set.add(s.substring(i,j));
			}
		}
		System.out.println(set.size());
	}

}
