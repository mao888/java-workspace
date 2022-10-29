package 美团9月3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.naming.ldap.SortControl;

import 练习本.List;

public class mex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
		int n = 4;
		int arr[] = new int []{5,0,4,3};
//		int n = sc.nextInt();
//		int arr [] = new int [n];
//		for (int i = 0; i < n; i++) {
//			int ai = sc.nextInt();
//			arr[i] = ai;
//		}
		
		for (int i = 0; i < n; i++) {
			System.out.print(mex1(arr, i)+" ");
		}
		
	}
	
	public static int mex1(int arr[], int w) {
		ArrayList list = new ArrayList();
		int arr2 [] = new int[arr.length - 1];
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			list.remove(w);
		}
		
		for (int j = 0; j < list.size(); j++) {
			arr2[j] = (int) list.get(j);
//			for(int m = 0;m < list.size(); m++) {
//				arr2[i] = (int) list.get(m);	
//			}
		}
		Arrays.sort(arr2);
		
		for (int k = 0; k < arr2.length; k++) {
			int min = 0;
			if (min < arr2[k] && min > 0) {
				return min;
			} 
			min ++;
		}
		
		return 0;
	}

}
