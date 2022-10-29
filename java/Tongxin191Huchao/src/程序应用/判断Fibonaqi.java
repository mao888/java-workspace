package 程序应用;

import java.util.Scanner;

public class 判断Fibonaqi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int a=0,b=1,n;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		while (a<num) {
			n=a+b;
			a=b;
			b=n;
		}
		if (num==a)System.out.println(num+"是Fibonacci数");
		else System.out.println(num+"不是Fibonacci数");
	}

}
