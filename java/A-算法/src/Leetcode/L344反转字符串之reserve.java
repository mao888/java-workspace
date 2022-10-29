package Leetcode;

public class L344·´×ª×Ö·û´®Ö®reserve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char s[] = {'h','e','l','l','o'};
		reverseString(s);
	}
    public static void reverseString(char[] s) {
    	StringBuffer sb = new StringBuffer();
    	for(int i=0;i<s.length;i++) {
    		sb.append(s[i]);
    	}
    	sb=sb.reverse();
    	
    	for(int i=0;i<sb.length();i++) {
    		s[i] = sb.charAt(i);
    	}
    }

}
