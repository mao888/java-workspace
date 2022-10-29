package 程序应用;

import java.util.Scanner;

public class Exercise4_9整数和浮点数部分 {
	public static void main(String[] args) {
		System.out.println("输入一个浮点型的数:");
		Scanner sc = new Scanner(System.in);
		double n =sc.nextDouble();
		double n2=n;
		int s=0;
		while (n>1) {
			n--;
			s+=1;
			if (n<1)break;
		}
		System.out.println("整数部分为:"+s+"  小数部分为:"+(n2-s));
	}
}

