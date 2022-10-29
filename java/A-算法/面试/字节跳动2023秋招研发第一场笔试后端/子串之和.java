package 字节跳动2023秋招研发第一场笔试后端;

import java.util.Scanner;

public class 子串之和 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			String s = sc.next();
		}
	
	}
	
	public static int ziChuanHe(int n, int k, String s) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += s.charAt(i) + s.charAt(i+1);
		}
		
		return 0;
	}

}