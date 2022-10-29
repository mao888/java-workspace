package Leetcode;

public class L344反转字符串之双指针 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char s[] = {'h','e','l','l','o'};
		reverseString(s);
	}
    public static void reverseString(char[] s) {
    	int p1 = 0;
    	int p2 = s.length-1;
    	char a;
    	while (p1<p2) {
    		a = s[p1];
    		s[p1++] = s[p2];
    		s[p2--] = a;
		}
    }
}
