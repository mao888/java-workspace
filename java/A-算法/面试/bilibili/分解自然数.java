package bilibili;

import java.util.Scanner;

public class 分解自然数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(minSum(n));
		
	}
	public static int minSum(int n) {
		if (n == 1 || n == 2) {
			return n;
		}
	for (int i = 2; i <= n/2; i++) {
		if (n % i == 0) {
			if (minSum(i) == i) {
				return i + minSum(n/i);
			}
		}
	}
		return n;
	}

}
