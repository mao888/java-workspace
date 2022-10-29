package 剑指OfferII专项突击版;

public class OfferII068查找插入位置之二分 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,3,5,6};
		System.out.println(searchInsert(nums, 7));
	}
	
    public static int searchInsert(int[] nums, int target) {
        // 设置查找区间为左开右闭，即[left,right)
        int left = 0, right = nums.length-1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid-1;
            } else {
                return mid;
            }
        }
        return left;
    }


}
