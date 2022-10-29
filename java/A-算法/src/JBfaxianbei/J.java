//第十题（字符串）
//输入一串长度一万以内的字符串，从中找出“kunkun”字符串出现的次数。
//输入：fgkunkundfsaf
//输出：1

package JBfaxianbei;

import java.util.Scanner;
// API String 的应用
public class J {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count =0;
		while(s.indexOf("maomao") >=0) {
			int x=s.indexOf("maomao");
			s =s.substring(x + 5);
			count++;
		}
		System.out.println(count);
	}

}
