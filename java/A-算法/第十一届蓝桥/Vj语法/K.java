package Vj”Ô∑®;

import java.util.Scanner;

public class K {
	public static long arr[]=new long [32];
	public static void Init() {
		arr[1]=1;
		for (int i = 2; i < 32; i++) {
			arr[i]= (arr[i-1]+1)*2;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Init();
		while (sc.hasNext()) {
			int n = sc.nextInt();
			System.out.println(arr[n]);
		}
	}

}
