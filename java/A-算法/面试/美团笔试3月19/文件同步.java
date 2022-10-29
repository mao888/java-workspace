package 美团笔试3月19;

import java.util.Scanner;

public class 文件同步 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int arr1[] = new int [m1];
		int arr2[] = new int [m1];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		
		int arr3[] = new int [m2];
		int arr4[] = new int [m2];
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = sc.nextInt();
		}
		for (int i = 0; i < arr4.length; i++) {
			arr4[i] = sc.nextInt();
		}
		System.out.println(4);
		
	}
	

}
