package Leetcode;
// 懵逼的时候:
// 暴力？ 基本情况？
// 找最近重复子问题 
// if else ;
// for while , recursion

//1:1
//2:2
//3:f(1)+f(2)
//4:f(2)+f(3)
//
//f(n)=f(n-1)+f(n-2)	; fibonacci: 斐波拉契数列



//极客   覃超方法
//package Leetcoad;
//
//class Solution(object):
//
//	def climbStairs(self,n):
//		if(n<=2): return n
//		f1,f2,f3 = 1,2,3
//		for i in range(3,n+1):
//			f3 = f1 + f2
//			f1 = f2 
//			f2 = f3
//		return f3
// 


// 方法二: 暴力破解   超出时间限制，无法提交
//public class L70palouti{
//	public int climbStairs(int n) {
//		return climb_Stairs(0,n);
//	}
//	public int climb_Stairs(int i,int n) {
//		if (i>n) {
//			return 0;
//		}
//	if (i == n) {
//		return 1;
//	}
//	return climb_Stairs(i + 1, n)+climb_Stairs(i + 2, n);
//	}
//}

//方法二：记忆化递归
//算法
//在上一种方法中，我们计算每一步的结果时出现了冗余。另一种思路是，我们可以把每一步的结果存储在 memo 数组之中，每当函数再次被调用，我们就直接从 memo 数组返回结果。
//在 memo 数组的帮助下，我们得到了一个修复的递归树，其大小减少到 n。
public class L70palouti {
    public int climbStairs(int n) {
        int memo[] = new int[n + 1];
        return climb_Stairs(0, n, memo);
    }
    public int climb_Stairs(int i, int n, int memo[]) {
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }
        if (memo[i] > 0) {
            return memo[i];
        }
        memo[i] = climb_Stairs(i + 1, n, memo) + climb_Stairs(i + 2, n, memo);
        return memo[i];
    }
}