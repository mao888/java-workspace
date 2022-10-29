package 剑指OfferII专项突击版;

import java.util.Iterator;

public class OfferII006排序数组中两个数字之和 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = {1,2,4,6,10};
		int target = 8;
		int arr[] = new int[2];
		/**  超时
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				if (numbers[i]+numbers[j]==target) {
					arr[0]=i;
					arr[1]=j;
					break;
				}
			}
		}
		*/
		int i = 0;
		int j = numbers.length-1;
		while(i<=j) {
			if (numbers[i]+numbers[j]>target) {
				j--;
			}else if (numbers[i]+numbers[j]<target) {
				i++;
			}else {
				arr[0]=i;
				arr[1]=j;
				break;
			}
		}
		for (int j1 : arr) {
			System.out.println(j1);
		}
		
	}

}
