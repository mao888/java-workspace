package Leetcode;


// 一维数组的坐标变换
// 法一: 1.枚举: left bar x, right bar y , (x-y)*height_diff
// O(n^2)


class Solution{
	public int maxArea(int[] a) {
		int max=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; ++j) {
				int area = (j - i)*Math.min(a[i], a[j]);
				max = Math.max(max, area);
			}
		}
		return max;
	}
}


// 法二 : 







