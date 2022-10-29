package À¶ĞÅ±ÊÊÔ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Êı×é {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {15,10,8,7,6,4,2,1};
		System.out.println(Shuzu(arr, 3));
	}
	public static List<Integer> Shuzu(int arr[],int n) {
		List<Integer> list = new ArrayList<Integer>();
		if (n > arr[arr.length-1]) {
			for (int i = 0; i < arr.length; i++) {
				if (n>arr[i]) {
					list.add(n);
					break;
				}
				list.add(arr[i]);
			}
			list.add(arr[arr.length-2]);
			list.add(arr[arr.length-1]);
		}
		return list;
	}
	
}