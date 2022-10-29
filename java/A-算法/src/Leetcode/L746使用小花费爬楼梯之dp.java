package Leetcode;

public class L746使用小花费爬楼梯之dp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cost[] = {1,100,1,1,1,100,1,1,100,1};
//		System.out.println(new L746使用�?小花费爬楼梯之dp().minCostClimbingStairs(cost));
	}
	
    public int minCostClimbingStairs(int[] cost) {
    	int dp[] = new int[cost.length];
    	dp[0] = cost[0];
    	dp[1] = cost[1];
    	for (int i = 2;i<cost.length;i++) {
			dp[i] = Math.min(dp[i-1], dp[i-2])+cost[i];
		}
    	// 注意�?后⼀步可以理解为不⽤花费，所以取倒数第⼀步，第⼆步的�?少�??
    	return Math.min(dp[cost.length-1], dp[cost.length-2]);
    }

}
