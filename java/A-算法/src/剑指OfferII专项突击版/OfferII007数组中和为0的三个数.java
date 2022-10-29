package 剑指OfferII专项突击版;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.*;

public class OfferII007数组中和为0的三个数 {
	
	public static void main(String[] args) {
		int nums[] ={-1,0,1,2,-1,-4};
		System.out.println(new OfferII007数组中和为0的三个数().threeSum(nums));
		
	}
	
    public List<List<Integer>> threeSum(int[] nums) {
    	if (nums==null||nums.length<3) {
			return new ArrayList<>(); 
		}
    
    	Set<List<Integer>> res = new HashSet<>();
		Arrays.sort(nums);	// 时间复杂度 O(nlogn)
//    	Set<List<Integer>> set = new HashSet<>();
    	
		// O(n^3)
    	for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				for (int k = j+1; k < nums.length; k++) {
					if (nums[i]+nums[j]+nums[k]==0) {
//						List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k]);
//						Collections.sort(temp); 	// 对list排序
						res.add(Arrays.asList(nums[i],nums[j],nums[k]));
					}
				}
			}	
		}
    	return new ArrayList<>(res);
    }
}
