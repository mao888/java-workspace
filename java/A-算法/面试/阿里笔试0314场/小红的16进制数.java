package 阿里笔试0314场;

import java.util.Scanner;

public class 小红的16进制数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char c[] = s.toCharArray();
		for (int i = 2; i < c.length; i++) {
			sum += JinZhi(c[i]);
		}
		System.out.println(sum);
		
	}
	
	
	public static int JinZhi(char c) {
		int a = c;
		int i = 0;
		while (a!=0) {
			a = a%2;
			i++;
		}
		return i;
	}
	
}