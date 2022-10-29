package Leetcode;

import java.util.Iterator;

public class L53最大子数组和 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
		int a = 0;
		int max = nums[0];
		for (int i : nums) {
			a = Math.max(a+i, a);
			max = Math.max(a, max);
		}
		System.out.println(max);
		
	}

}
