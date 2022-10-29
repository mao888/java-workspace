package Vj”Ô∑®;

import java.util.Scanner;

public class W {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if(n==0)break;
			int arr[]=new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n-i-1; j++) {
					if(Math.abs(arr[j])<Math.abs(arr[j+1])) {
						int t= arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = t;
					}
				}
			}
			StringBuilder ans = new StringBuilder();
			for (int i = 0; i < n; i++) {
				ans.append(arr[i]+(i==n-1?"":" "));
			}
			System.out.println(ans);
		}
	}

}
