package 程序应用;

import java.util.Scanner;

public class Exercise4_5阶乘倒数求和 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		double sum = 0;
		System.out.println("请输入数n:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
//		double  s=1.0;
		for (int i = 1; i <=n; i++) {
			double  s=1.0;
			
			for (int j = 1; j <=i; j++) {
				s*=j;
			}
			s=1.0/s;
			if (i%2==0)s=(-1)*s;
			sum+=s;
		}
		System.out.println("sum="+sum);
	}

}
