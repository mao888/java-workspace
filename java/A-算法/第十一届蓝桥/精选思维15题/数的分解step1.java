package 精选思维15题;

import java.util.Scanner;

public class 数的分解step1 {

	public static boolean jud(int s) {
		while (s>0) {
			int t = s%10;
			if (t==2 || t ==4) {
				return false;
			}
			s/=10;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count =0;
		for (int i = 1; i < n/3; i++) {
			for (int j = 1; j < n; j++) {
				int k = n-i-j;
				if (k>j&&j>i) {
					if(jud(i)&&jud(j)&&jud(k))
						count++;
				}
			}
		}
		System.out.println(count);
	}
}
