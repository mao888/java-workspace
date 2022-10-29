package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class L3无重复字符的最长子串之滑动窗口Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcabcbb";
		System.out.println(new L3无重复字符的最长子串之滑动窗口Set().lengthOfLongestSubstring(s));
	}
	
    public int lengthOfLongestSubstring(String s) {
    	// 哈希集合，记录每个字符是否出现过
    	Set<Character> set = new HashSet<>();
    	int n = s.length();
    	// 右指针，初始值为-1，相当于我们在字符串的左边界的左侧，还没有开始移动
    	int right = -1;
    	int ans = 0;
    	for(int i = 0;i<n;i++) {
    		if (i!=0) {
				// 左指针向右移动一格，移除一个字符
    			set.remove(s.charAt(i-1));
			}
    		while(right+1<n && !set.contains(s.charAt(right+1))) {
    			set.add(s.charAt(right+1));
    			right++;
    		}
    		// 第i到rk个字符是一个极长的无重复字符子串
    		ans = Math.max(ans, right-i+1);
    	}
    	return ans;
    }

}
