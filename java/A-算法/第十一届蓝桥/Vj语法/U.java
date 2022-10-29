package Vj”Ô∑®;

import java.util.Scanner;

public class U {
	public static long arr[] = new long [56];
	public static void name() {
		arr[1]=1;
		arr[2]=2;
		arr[3]=3;
		arr[4]=4;
		for (int i = 5; i < 56; i++) {
			arr[i] = arr[i-1]+arr[i-3];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		name();
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if(n==0)break;
			System.out.println(arr[n]);
		}
	}

}
