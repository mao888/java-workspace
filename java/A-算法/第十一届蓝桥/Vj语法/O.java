package Vj”Ô∑®;

import java.util.Scanner;

public class O {
	public static long gcd(long x,long y) {
		if (y==0) return x;
		else return gcd(y,x%y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			long ans =1;
			for (int i = 0; i < n; i++) {
				long x=sc.nextLong();
				ans = ans*x/gcd(ans,x);
			}
			System.out.println(ans);
		}
	}

}
