package 程序应用;

import java.util.Scanner;

//判断完全数	
//完全数是指其所有因数（包括1但不包括其自身）的和等于该数自身的数
public class Exercise4_7完全数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入一个数:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		for (int i = 1; i <=n/2; i++) {
			if (n%i==0) sum+=i;
		}
		if (n==sum)System.out.println("输入的数"+n+"是完全数");
		else System.out.println("输入的数"+n+"不是完全数");
	}

}
