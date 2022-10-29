package Vj”Ô∑®;

import java.util.Scanner;

public class K2 {
	public static long arr[] = new long[35];
	public static void name() {
		 arr[1]=1;
		 for (int i = 2; i < arr.length; i++) {
			arr[i] = (arr[i-1])*2+2;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		name();
		while (sc.hasNext()) {
			int n = sc.nextInt();
			System.out.println(arr[n]);
		}
	}
}
 