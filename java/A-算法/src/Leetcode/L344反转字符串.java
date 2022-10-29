package Leetcode;

public class L344·´×ª×Ö·û´® {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char s[] = {'h','e','l','l','o'};
		reverseString(s);
	}
	
    public static void reverseString(char[] s) {
    	StringBuffer sb = new StringBuffer();
    	for (int i = s.length-1; i >=0; i--) {
			 sb.append(s[i]);
		}
    	for(int i=0;i<sb.length();i++) {
    		s[i] = sb.charAt(i);
    	}
    }
    
}
