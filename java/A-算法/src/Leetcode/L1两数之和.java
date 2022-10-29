package Leetcode;

public class L1两数之和 {

	public int[] twoSum(int[] nums, int target) {
		int[] a = new int[2];
		int numSize = nums.length;
				for (int i = 0; i < numSize - 1; i++) {
					for (int j = i+1; j < numSize; j++) {
						if(nums[i] + nums[j] == target) {
							a[0] = i;
							a[1] = j;
							return a;
						}
					}
				}
				return new int[0];
	}

}
