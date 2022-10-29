package VjÓï·¨;

import java.util.HashSet;
import java.util.Scanner;

public class P {
	public static int check(int x) {
		HashSet<Integer> set= new HashSet<>();
		set.add(1);
		for (int j = 2; j < Math.sqrt(x); j++) {
			if (x%j==0) {
				set.add(j);
				set.add(x/j);
			}
		}
		int ans = 0;
		for (int i : set) {
			ans+=i;
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (check(a)==b&&check(b)==a) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}

}
