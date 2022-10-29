package 剑指OfferII专项突击版;
				
public class OfferII019最多删除一个字符得到回文 {
				
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		System.out.println(new OfferII019最多删除一个字符得到回文().validPalindrome(s));
	}			
    public boolean validPalindrome(String s) {
    	StringBuffer sb = new StringBuffer();
    	int left = 0;
    	int right = s.length()-1;
    	while (left<right) {
    		// 如果不相等，则分两种情况：删除左边的元素，或者右边的元素，再判断各自是否回文，满足一种即可。
			if (s.charAt(left)!=s.charAt(right)) {
				return isPalindrome(s, left+1, right)||isPalindrome(s, left, right-1);
			}
			left++;
			right--;
		}
    	return true;
    }
    // 判断字符串 s 的 [left, right] 是否回文
    public boolean isPalindrome(String s, int left,int right) {
    	while (left<right) {
			if (s.charAt(left)!=s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
    	return true;
    }

}
