package 数字马力2022年10月25;

import java.util.Scanner;

public class 统计大写字母个数 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		int a = 0;
		for (int i = 0; i < str.length(); i++) {
			if ('A'<=str.charAt(i)&&str.charAt(i) <= 'Z') {
				a++;
			}
		}
		System.out.println(a);
	}
}
