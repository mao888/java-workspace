package 剑指OfferII专项突击版;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import Java2021发现杯热身赛.RE;
import 数组.foreach遍历二维数组;

public class OfferII007数组中和为0的三个数之双指针法 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] ={-1,0,1,2,-1,-4};
		System.out.println(new OfferII007数组中和为0的三个数之双指针法().threeSum(nums));
	}
	
	public List<List<Integer>> threeSum(int[] nums){
		if (nums==null||nums.length<3) {
			return new ArrayList<>(); 
		}  
		
		List<List<Integer>> res= new ArrayList<>();
		Arrays.sort(nums);  // 时间复杂度 O(nlogn)
		
		//时间复杂度  O(n^2)
		for (int i = 0; i < nums.length-2; i++) {	  // 时间复杂度O(n)
			// i 去重
			if (i>0 && nums[i]==nums[i-1]) {
				continue;
			}
			// 在 i + 1 ... nums.length - 1 中查找相加等于 -nums[i] 的两个数
			int target = -nums[i];
			int left = i+1;
			int right = nums.length-1;
			while (left<right) {	// 时间复杂度O(n)
				int sum = nums[left]+nums[right];
				if (sum==target) {
					res.add(Arrays.asList(nums[i],nums[left],nums[right]));
					// 去重 如果前一个left==后面的left  跳过
//					while (left<right&& nums[left]==nums[++left]);
//					while (left<right&& nums[right]==nums[--right]);
					while (left<right) {
						left++;
						if (nums[left-1]!=nums[left]) {
							break;	// 当left-1 ！=left 的时候 跳出left++循环 左指针去重完毕
						}
					}
					
					while (left<right) {
						right--;
						if (nums[right]!=nums[right+1]) {
							break;	// 当 right ！= right+1的时候 跳出right--循环 右指针去重完毕
						}
					}
				}else if (sum < target) {
					left++;
				}else {
					right--;
				}
			}
		}
	
		return res;	// O(n)
	}
	
	
}
