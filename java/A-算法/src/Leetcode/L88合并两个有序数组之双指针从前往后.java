package Leetcode;

import java.util.Arrays;

public class L88合并两个有序数组之双指针从前往后 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums1[] = {1,2,3,0,0,0};
		int m = 3;
		int nums2[] = {2,5,6};
		int n = 3;
		merge(nums1,m,nums2,n);
	}
	
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
    	int nums1copy[] = new int[m];
    	System.arraycopy(nums1, 0, nums1copy, 0, m);
    	
    	int p  = 0;		// nums1指针
    	int p1 = 0;		// nums1copy 指针	
    	int p2 = 0;		// nums2 指针
    	
    	while ((p1<m) && (p2<n)) {
			if (nums1copy[p1]<nums2[p2]) {
				nums1[p] = nums1copy[p1];
				p++;
				p1++;
			}else {
				nums1[p] = nums2[p2];
				p++;
				p2++;
			}
		}
    	if (p1<m) {
			System.arraycopy(nums1copy, p1, nums1, p1+p2,m+n-p1-p2);
		}
		if (p2<n) {
			System.arraycopy(nums2, p2, nums1, p1+p2, m+n-p1-p2);
		}
    }

}
