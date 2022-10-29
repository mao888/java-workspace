package 剑指OfferII专项突击版;

import java.util.Iterator;

public class OfferII018有效的回文之reserve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "race a car";
//		String s = "A man, a plan, a canal: Panama";
		System.out.println(new OfferII018有效的回文之双指针().isPalindrome(s));
	}
	
    public boolean isPalindrome(String s) {
    	StringBuffer sb = new StringBuffer();
    	s = s.toLowerCase();
    	for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isLetterOrDigit(c)) {
				sb.append(c);
			}
		}
    	return sb.toString().equals(new StringBuffer(sb).reverse().toString());
    }

}
