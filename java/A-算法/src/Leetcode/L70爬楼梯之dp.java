package Leetcode;

import java.util.Iterator;

public class L70ÅÀÂ¥ÌİÖ®dp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		System.out.println(new L70ÅÀÂ¥ÌİÖ®dp().climbStairs(n));
	}
	
    public int climbStairs(int n) {
    	if (n<=1) {
			return 1;
		}
    	int a0 = 0;
    	int a1 = 1;
    	int sum = 1;
    	for (int i = 2; i <=n; i++) {
			a0 = a1;
			a1 = sum;
			sum = a0+a1;
		}
    	return sum;
    }
	

}
