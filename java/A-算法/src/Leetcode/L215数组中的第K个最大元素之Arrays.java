package Leetcode;

import java.util.Arrays;

public class L215数组中的第K个最大元素之Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,2,3,1,2,4,5,5,6};
		
		System.out.println(findKthLargest(arr, 4));
	}
	
	public static int findKthLargest(int[] nums, int k) {
		Arrays.sort(nums);
    	return nums[nums.length-k];
    }
}
