package Java2021∑¢œ÷±≠;

import java.util.Iterator;
import java.util.Scanner;

public class MainE {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long[] arr = new long[200005];
		arr[1] = 2;
		arr[2] = 3;
		for (int i = 3; i<=n; i++) {
			arr[i] = arr[i-1] + arr[i-2];
			arr[i]%=1000000007;
		}
		System.out.println(arr[n]);
	}
}