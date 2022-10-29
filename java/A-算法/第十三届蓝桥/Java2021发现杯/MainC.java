package Java2021∑¢œ÷±≠;

import java.util.Arrays;
import java.util.Scanner;

public class MainC {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int yuanShi = sc.nextInt();
		int up = sc.nextInt();
		int arr[]=new int[up];
		for (int i = 0; i < up; i++) {
			int upCiShu = sc.nextInt();
			arr[i]=upCiShu;
		}
		int min = arr[0];
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i; j < arr.length; j++) {
//				if(arr[j]<arr[i]){
//					min = arr [j];
//					arr[j]=arr[i];
//					arr[i]=min;
//				}
//			}
//		}
		Arrays.sort(arr);
		int ciShu = yuanShi/160;
		int count=0,sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
			if(sum>ciShu){
				break;
			}
			count ++;			
		}
		System.out.println(count);
	}
}