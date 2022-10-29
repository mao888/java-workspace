package 真题2019;

import java.util.Scanner;

public class 特别数的和2星 {
	
	public static boolean check(int k) {
		while (k>0) {
			if(k%10==2||k%10==0||k%10==1||k%10==9) {
				return true;
			}
			k=k/10;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int ans =0;
		for (int i = 0; i <=n; i++) {
			if (check(i)) {
				ans+=i;
			}
		}
		System.out.println(ans);
	}

}
