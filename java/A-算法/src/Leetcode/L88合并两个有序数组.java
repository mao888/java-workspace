package Leetcode;

import java.util.Arrays;

public class L88合并两个有序数组 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums1[] = {1,2,3,0,0,0};
		int m = 3;
		int nums2[] = {2,5,6};
		int n = 3;
		merge(nums1,m,nums2,n);
	}
	
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
    	for (int i = 0; i < n; i++) {
    		nums1[m] = nums2[i];
    		m++;
		}
    	Arrays.sort(nums1);
    	for (int i : nums1) {
			System.out.println(i);
		}
    }

}
