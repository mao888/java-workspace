package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L350两个数组的交集II之排序预处理 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums1[] = {1,2,2,1};
		int nums2[] = {2,2};
		System.out.println(new L350两个数组的交集II之排序预处理().intersect(nums1, nums2));
	}
	
    public int[] intersect(int[] nums1, int[] nums2) {
    	
    	List<Integer> list = new ArrayList<>();
    	Arrays.sort(nums1);
    	Arrays.sort(nums2);
    	
    	for (int i = 0,j=0;i<nums1.length && j<nums2.length;) {
			if (nums1[i]>nums2[j]) {
				j++;
			}else if (nums1[i]<nums2[j]) {
				i++;
			}else {
				list.add(nums1[i]);
				i++;
				j++;
			}
		}
    	int arr[] = new int[list.size()];
    	int num = 0;
    	for (int i : list) {
			arr[num] = i;
			num ++;
		}
    	return arr;
    }

}
