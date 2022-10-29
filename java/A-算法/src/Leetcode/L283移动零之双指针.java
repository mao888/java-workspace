package Leetcode;

public class L283ÒÆ¶¯ÁãÖ®Ë«Ö¸Õë {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {0,1,0,3,12};
		moveZeroes(nums);
	}
    public static void moveZeroes(int[] nums) {
    	int left = 0;
    	int right =0;
    	while (right<nums.length) {
			if (nums[right]!=0) {
				swap(nums, left, right);
				left++;
			}
			right++;
		}
    	for (int i : nums) {
			System.out.println(i);
		}
    }
    
    public static void swap(int nums[],int left,int right) {
    	int temp = nums[left];
    	nums[left] = nums[right];
    	nums[right] = temp;
    }

}
