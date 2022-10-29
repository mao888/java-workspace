package 蓝信春招0322;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class 任意两数之和 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {-2,28,-2,19,-9,21,15,20,-10,-18};
		System.out.println(twoPlus(nums));
	}
	
    public static int[][] twoPlus(int[] nums) {
    	Arrays.sort(nums);
//    	List<List<Integer>> list = new ArrayList<List<Integer>>();
    	List<Integer> list1 = new ArrayList<Integer>();
    	List<Integer> list2 = new ArrayList<Integer>();
    	int s = 0;
    	for (int i = 0; i < nums.length; i++) {
    		for (int j = i+1; j < nums.length; j++) {
				if (nums[i] +nums[j]==10) {
					s += 1;
					list1.add(nums[i]);
					list2.add(nums[j]);
				}
			}
		}
    	
    	int arr[][] = new int[s][2];
    	for (int i = 0; i < arr.length; i++) {
    		arr[i][0] = list1.get(i);
    		arr[i][1] = list2.get(i);
		}
    	return arr;
    }

}
