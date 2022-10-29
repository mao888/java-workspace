package 蓝信春招0322;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 任意两数之和圆圆 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int[][] twoPlus(int[] nums) {
    	Arrays.sort(nums);
    	List<List<Integer>> list = new ArrayList<List<Integer>>();
    	int s = 0;
    	for (int i = 0; i < nums.length; i++) {
    	    List<Integer> li=new ArrayList<Integer>();
    		for (int j = i+1; j < nums.length; j++) {
				if (nums[i] +nums[j]==10) {
					s += 1;
					li.add(nums[i]);
					li.add(nums[j]);
					break;
				}
			}
		}
    	
    	
    	int [][]a=new int[list.size()][2];
    	for(int i=0;i<list.size();i++) {
    		for(int j=0;j<2;j++) {
    			a[i][j]=list.get(i).get(j);
    		}
    	}
    	return a;
    }

}
