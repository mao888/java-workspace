package VjÓï·¨;

import java.util.Scanner;

public class Q {

	public static int arr[]= new int[32];
	public static void name() {
		arr[0]=3;
		for (int j = 1; j < 32; j++) {
			arr[j] = (arr[j-1]-1)*2;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		name();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			System.out.println(arr[a]);
		}
	}

}
