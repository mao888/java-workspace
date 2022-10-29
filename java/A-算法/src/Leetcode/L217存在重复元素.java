package Leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class L217´æÔÚÖØ¸´ÔªËØ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,2,3,4,4};
		Set<Integer>arr=new HashSet<Integer>();
		for (int i : nums) {
			arr.add(i);
		}
		System.out.println(arr.size()<nums.length?true:false);
//		return arr.size()<nums.length?true:false;
	}

}
