package Leetcode;

public class L283“∆∂Ø¡„1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {0,1,0,3,12};
		moveZeroes(nums);
	}

	public static void moveZeroes(int[] nums) {
		int index=0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]!=0) {
				nums[index]=nums[i];
				index++;
			}
		}
		for (int i = index; i < nums.length; i++) {
			nums[index] = 0;
			index++;
		}
		for (int i : nums) {
			System.out.println(i);
		}
    }
	
}
