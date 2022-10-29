package Leetcode;

import java.util.Arrays;

public class L88合并两个有序数组之双指针从后往前 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums1[] = {0};
		int m = 0;
		int nums2[] = {1};
		int n = 1;
		merge(nums1,m,nums2,n);
	}
	
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
    	int p1 = m-1;
    	int p2 = n-1;
    	int p = m+n-1;
    	while (p1>=0&&p2>=0) {
			if (nums1[p1]<nums2[p2]) {
				nums1[p] = nums2[p2];
				p--;
				p2--;
			}else {
				nums1[p] = nums1[p1];
				p--;
				p1--;
			}
		}
    	System.arraycopy(nums2, 0, nums1, 0, p2+1);		// 当nums1 为空的时候直接执行此方法
    	for (int i : nums1) {
			System.out.println(i);
		}
    }
	
}
