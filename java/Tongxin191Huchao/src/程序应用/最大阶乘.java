package 程序应用;

import java.util.Scanner;

public class 最大阶乘 {
	public static void main(String[] args) {
		int s=1,n=1,m ;
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		do {
			System.out.println("请输入大于1的正整数:");
		} while (m<=1);
		while (s<m) {
			s*=n;
			n++;
		}
	}
}
