package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class L118Ñî»ÔÈý½Ç {
/**
 * 	1
 * 	1	1
 * 	1	2	1
 * 	1	3	3	1
 * 	1	4	6	4	1
 * */	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numRows =5;
		System.out.println(new L118Ñî»ÔÈý½Ç().generate(numRows));
	}
	
    public List<List<Integer>> generate(int numRows) {
    	int arr[][] = new int[numRows][numRows];
    	for (int i = 0; i < arr.length; i++) {
    		arr[i][0] = 1;
    		arr[i][i] = 1;
		}
    	for (int i = 2; i < numRows; i++) {
    		for (int j = 1; j <=i; j++) {
				arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
			}
		}
    	List<List<Integer>> lists = new ArrayList<>();
    	for (int i = 0; i < numRows; i++) {
    		List<Integer> list = new ArrayList<>();
    		for (int j = 0; j <=i; j++) {
					list.add(arr[i][j]);
			}
			lists.add(list);
		}
    	return lists;
    }

}
