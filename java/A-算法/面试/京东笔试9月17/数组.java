package 京东笔试9月17;

import java.util.Scanner;

public class 数组 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();		// 1
		int b = sc.nextInt();		// 2
		int len = a + b;
		int arr[] = new int[len];
		
		int kong = b + 1;
		if (a > kong) {
			System.out.println(-1);
		}else {
			for (int i = 0; i < len; i++) {
				if (a > 0) {
					if (i % 2 == 0) {
						arr[i] = 1;
						a = a-1;
					}
				}	
			}
			for (int i = 0; i < arr.length; i++) {
				if (arr[i]==0) {
					arr[i]=2;
				}
			}
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i] );	
			}	
		}
	}
}
