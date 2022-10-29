package 真题2019;

import java.util.Scanner;

public class 数列求和2星2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=1,b=1,c=1,t=1;
		for (int i = 4; i <=n; i++) {
			t=a;
			a=(a+b+c)%10000;
			b=c;
			c=t;
		}
		System.out.println(a);
	}

}
