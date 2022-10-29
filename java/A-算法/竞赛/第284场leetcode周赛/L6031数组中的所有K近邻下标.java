package 第284场leetcode周赛;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class L6031数组中的所有K近邻下标 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,4,9,1,3,9,5};
		int arr1[] = {2,2,2,2,2};
		System.out.println(findKDistantIndices(arr, 9, 1));
	}
	
    public static List<Integer> findKDistantIndices(int[] nums, int key, int k) {
    	
    	List<Integer> list = new ArrayList<Integer>();
    	Set<Integer> set = new HashSet<>();
    	for (int i = 0; i < nums.length; i++) {
			if (nums[i] == key) {
				set.add(i);
			}
		}
    	for (int i = 0; i < nums.length; i++) {
    		for (Integer integer : set) {
				if (Math.abs(i-integer) <= k) {
					list.add(i);
					break;
				}
			}
    	}
    	return list;
    }

}
