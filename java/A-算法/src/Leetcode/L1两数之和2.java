package Leetcode;

import java.util.HashMap;
import java.util.Iterator;

public class L1两数之和2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {2,7,11,15};
		System.out.println(new L1两数之和2().twoSum(nums, 9));
	}
	
    public int[] twoSum(int[] nums, int target) {
    	HashMap<Integer, Integer> hash = new HashMap<>();
    	int arr[] = new int [2];
    	for (int i = 0; i < nums.length; i++) {
			if (hash.containsKey(target-nums[i])) {
//				return new int[] {hash.get(target-nums[i]),i};
				arr[0] = hash.get(target-nums[i]);
				arr[1] = i;
			}
			hash.put(nums[i], i);
		}
    	return arr;
    }
	

}
