package 美团笔试3月19;

import java.util.Scanner;

public class 整除 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    int k1 = sc.nextInt();
		int k2 = sc.nextInt();
		int []arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		int fanan = 1;
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				sum = arr[i] + arr[j];
				if (Panduan(sum, k1, k2)) {
					if (sum > max) {
						max = sum;
						fanan++;
					}
//					fanan ++;
				}
				for (int j2 = j+1; j2 < arr.length; j2++) {
					sum = add(sum, arr, j2);
					if (Panduan(sum, k1, k2)) {
						if (sum > max) {
							max = sum;
							fanan++;
						}
//						fanan ++;
					}
					
				}
				
			}
		}
		System.out.println(max + " " + fanan);
	}
	
	public static int add(int sum,int arr[],int i) {
			sum = sum + arr[i];
		return sum;
	}
	
	public static boolean Panduan(int sum,int k1,int k2) {
		if (sum%k1==0 && sum%k2 !=0) {
			return true;
		}
		return false;
	}
}
