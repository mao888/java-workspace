package Leetcode;

import java.util.Iterator;

public class L121买卖股票的最佳时机之暴力 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prices[] = {7,1,5,3,6,4};
		System.out.println(new L121买卖股票的最佳时机之暴力().maxProfit(prices));
	}
	
	public int maxProfit(int[] prices) {
		int max =0;
		for (int i = 0; i < prices.length-1; i++) {
			for (int j = i+1; j < prices.length; j++) {
				if (prices[j]-prices[i]>max) {
					max = prices[j] - prices[i];
				}
			}
		}
		return max;
	}
}
