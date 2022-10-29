package Vj”Ô∑®;

import java.util.Scanner;

public class S {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if(n==0)break;
			int arr[]= new int[n];
			int min =Integer.MAX_VALUE;
			int index=0;
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
				if (arr[i]<min) {
					min = arr[i];
					index = i;
				}
			}
			int t=arr[index];arr[index]=arr[0];arr[0]=t;
			for (int i = 0; i < n-1; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println(arr[n-1]);
		}
	}

}
