package 程序应用;

import java.util.Scanner;

//计算并输出一个整数各位数字之和
//5423的各位数字之和为5+4+2+3
public class Exercise4_8各位数字之和 {
	public static void main(String[] args) {
		System.out.println("请输入一个数:");
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int sum=0,k;
		while (n!=0) {
			k=n%10;
			n=n/10;
			sum+=k;
		}
		System.out.println("各位数之和为:"+sum);
	}
}
