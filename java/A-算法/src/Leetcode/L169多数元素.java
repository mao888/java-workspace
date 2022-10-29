package Leetcode;

import java.util.Arrays;

public class L169¶àÊıÔªËØ {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {2,2,1,1,1,2,2};
		System.out.println(majorityElement(nums));
	}
	
    public static int majorityElement(int[] nums) {
    	int count = 1;
    	int jizhun = nums[0];
    	for (int i = 1; i < nums.length; i++) {
			if (nums[i]==jizhun) {
				count++;
			}else {
				count--;
				if (count==0) {
					jizhun=nums[i+1];
				}
			}
		}
    	return jizhun;
    }

}
