package Leetcode;

import java.util.Iterator;

public class L121买卖股票的最佳时机之一次遍历 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prices[] = {7,1,5,3,6,4};
		System.out.println(Integer.MAX_VALUE);
	}
	
	public int maxProfit(int[] prices) {
		int min = Integer.MAX_VALUE;
		int max = 0;
		for (int i = 0; i < prices.length; i++) {
			if (prices[i]<min) {
				min = prices[i];
			}else if (prices[i]- min>max) {
				max = prices[i] - min;
			}
		}
		return max;
	}
	

}