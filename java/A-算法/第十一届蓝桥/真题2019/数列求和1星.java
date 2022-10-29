package 真题2019;

import java.util.Scanner;

public class 数列求和1星 {
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=1,b=1,c=1,z=1;
		for (int i = 4; i <=n ; i++) {
			z= (a+b+c)%10000;
			a=b;
			b=c;
			c=z;
		}
		System.out.println(z);
	}
}
