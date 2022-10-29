package 深信服9月14日;

import java.util.Arrays;
import java.util.Scanner;

public class 病毒闯关记 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int x = sc.nextInt();
//		int arr[] = new int[n];
		int arr[] = new int[]{4,9,6,7,10};
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
		System.out.println(weiZhuang(arr, 4));
	}
	
	public static int weiZhuang(int arr[],int x) {
		int len = arr.length/2;
		Arrays.sort(arr);
		int v = arr[len];
		int cishu = 0;
		for (int i = 0; i < arr.length; i++) {
			if (Math.abs(arr[i] - v) > x) {
				v = arr[i];
				cishu ++;
			}
			
		}
		return cishu;
	}
}